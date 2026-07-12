package model;

import enums.SlotStatus;

public class Slot {
	private int slotId;
	private Vehicle vehicle;
	private SlotStatus status;
	public Slot(int id) {
		this.slotId = id;
		this.vehicle = null;
		this.status = SlotStatus.AVAILABLE;
	}
	public void setVehicle(Vehicle v) {
		this.vehicle=v;
	}
	public void setStatus(SlotStatus occ) {
		this.status=occ;
	}
	public int getSlotId() {
		return this.slotId;
	}
	public Vehicle getVehicle() {
		return this.vehicle;
	}
	public SlotStatus getStatus() {
		return this.status;
	}
	public String toString() {
		return this.slotId+" "+this.vehicle+" "+this.status;
	}
	
}
