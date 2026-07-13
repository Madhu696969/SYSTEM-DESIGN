package service;

import enums.SlotStatus;
import model.Slot;
import model.Ticket;
import model.Vehicle;
import repository.SlotRepository;
import repository.VehicleRepository;

import java.util.List;

public class ParkingService{
    private final VehicleRepository vehicleRepository;
    private final SlotRepository slotRepository;
    private final TicketService ticketService;
    private final FeeService feeService;

    public ParkingService(
            VehicleRepository vehicleRepository,
            SlotRepository slotRepository,
            TicketService ticketService,
            FeeService feeService) {
        this.vehicleRepository = vehicleRepository;
        this.slotRepository = slotRepository;
        this.ticketService = ticketService;
        this.feeService = feeService;
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        if (vehicleRepository.containsVehicle(vehicle.getVehicleNumber())) {
            throw new RuntimeException("Vehicle already parked.");
        }
        List<Slot> slots = slotRepository.getAvailableSlots();
        if (slots.isEmpty()) {
            throw new RuntimeException("Parking Lot Full.");
        }
        Slot slot = slots.get(0);
        slot.setVehicle(vehicle);
        slot.setStatus(SlotStatus.OCCUPIED);
        vehicleRepository.addVehicle(vehicle);
        return ticketService.generateTicket(vehicle, slot);
    }
    
    public double removeVehicle(int ticketId) {
        Ticket ticket = ticketService.getTicket(ticketId);
        if (ticket == null) {
            throw new RuntimeException("Invalid Ticket.");
        }
        ticketService.closeTicket(ticketId);
        double fee = feeService.calculateFee(ticket);
        Slot slot = ticket.getSlot();
        slot.setVehicle(null);
        slot.setStatus(SlotStatus.AVAILABLE);
        vehicleRepository.removeVehicle(
                ticket.getVehicle().getVehicleNumber());
        ticketService.removeTicket(ticketId);
        return fee;
    }
    public void displayAvailableSlots() {
        List<Slot> slots = slotRepository.getAvailableSlots();
        System.out.println("Available Slots:");
        for (Slot slot : slots) {
            System.out.println(slot.getSlotId());
        }
    }
}