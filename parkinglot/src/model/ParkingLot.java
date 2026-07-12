package model;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String parkingLotName;
    private List<Slot> slots;
    public ParkingLot(String parkingLotName) {
        this.parkingLotName = parkingLotName;
        this.slots = new ArrayList<>();
    }
    public String getParkingLotName() {
        return parkingLotName;
    }
    public List<Slot> getSlots() {
        return slots;
    }
    public void addSlot(Slot slot) {
        slots.add(slot);
    }
    @Override
    public String toString() {
        return "ParkingLot{" +
                "parkingLotName='" + parkingLotName + '\'' +
                ", slots=" + slots +
                '}';
    }
}