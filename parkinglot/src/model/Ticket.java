package model;
import java.time.LocalDateTime;

public class Ticket {
	private int ticketId;
	private Slot slot;
	private Vehicle vehicle;
	private LocalDateTime entryTime;
	private LocalDateTime exitTime;

	public Ticket(int ticketId, Vehicle vehicle, Slot slot, LocalDateTime entryTime) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.slot = slot;
        this.entryTime = entryTime;
        this.exitTime = null;
    }

    public int getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Slot getSlot() {
        return slot;
    }
    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }
    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", vehicle=" + vehicle +
                ", slot=" + slot +
                ", entryTime=" + entryTime +
                ", exitTime=" + exitTime +
                '}';
    }

}
