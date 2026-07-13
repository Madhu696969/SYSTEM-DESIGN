package service;
import java.time.LocalDateTime;

import model.Slot;
import model.Ticket;
import model.Vehicle;
import repository.TicketRepository;

public class TicketService {
	
	private final TicketRepository ticketRepository;
	private static int ticketCounter = 1;
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }   
	public Ticket generateTicket(Vehicle vehicle,Slot slot) {
		Ticket ticket=new Ticket(ticketCounter++,vehicle,slot,LocalDateTime.now());
		ticketRepository.addTicket(ticket);
		return ticket;
	}
	public Ticket getTicket(int ticketId) {
		return ticketRepository.getTicket(ticketId);
	}
	public void closeTicket(int ticketId) {
		Ticket ticket = ticketRepository.getTicket(ticketId);
	    if (ticket!=null){
	        ticket.setExitTime(LocalDateTime.now());
	    }
	}
	public void removeTicket(int ticketId) {
		ticketRepository.removeTicket(ticketId);
	}
}
