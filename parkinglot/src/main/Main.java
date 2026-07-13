package main;

import enums.VehicleType;
import model.Slot;
import model.Ticket;
import model.Vehicle;
import repository.SlotRepository;
import repository.TicketRepository;
import repository.VehicleRepository;
import service.FeeService;
import service.ParkingService;
import service.TicketService;

public class Main {
    public static void main(String[] args) {
        VehicleRepository vehicleRepository = new VehicleRepository();
        SlotRepository slotRepository = new SlotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        for (int i = 1; i <= 5; i++) {
            slotRepository.addSlot(new Slot(i));
        }
        TicketService ticketService =
                new TicketService(ticketRepository);

        FeeService feeService =
                new FeeService();

        ParkingService parkingService =
                new ParkingService(
                        vehicleRepository,
                        slotRepository,
                        ticketService,
                        feeService
                );
        Vehicle car =
                new Vehicle("AP39AB1234", VehicleType.CAR);
        Vehicle bike =
                new Vehicle("AP39XY5678", VehicleType.BIKE);
        Vehicle truck =
                new Vehicle("AP39TR9999", VehicleType.TRUCK);
        Ticket t1 =
                parkingService.parkVehicle(car);
        Ticket t2 =
                parkingService.parkVehicle(bike);
        Ticket t3 =
                parkingService.parkVehicle(truck);
        parkingService.displayAvailableSlots();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double fee =
                parkingService.removeVehicle(
                        t1.getTicketId());
        System.out.println("Fee = ₹" + fee);
        parkingService.displayAvailableSlots();
    }
}