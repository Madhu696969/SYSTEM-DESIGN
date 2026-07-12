package repository;
import model.Ticket;
import java.util.*;


public class TicketRepository{
    private final HashMap<Integer, Ticket> tickets;
    public TicketRepository(){
        this.tickets=new HashMap<>();
    }
    public void addTicket(Ticket ticket){
        tickets.put(ticket.getTicketId(),ticket);
    }
    public Ticket getTicket(int ticketId){
        return tickets.get(ticketId);
    }
    public void removeTicket(int ticketId){
        tickets.remove(ticketId);
    }
    public boolean containsTicket(int ticketId){
        return tickets.containsKey(ticketId);
    }
    public Collection<Ticket> getAllTickets(){
        return tickets.values();
    }
}