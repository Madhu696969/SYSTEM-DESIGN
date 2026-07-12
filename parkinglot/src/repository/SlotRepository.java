package repository;
import enums.SlotStatus;
import model.Slot;
import java.util.*;


public class SlotRepository {
    private final HashMap<Integer, Slot> slots;
    public SlotRepository() {
        this.slots=new HashMap<>();
    }
    public void addSlot(Slot slot) {
        slots.put(slot.getSlotId(), slot);
    }
    public Slot getSlot(int slotId) {
        return slots.get(slotId);
    }
    public void removeSlot(int slotId) {
        slots.remove(slotId);
    }
    public boolean containsSlot(int slotId) {
        return slots.containsKey(slotId);
    }
    public Collection<Slot> getAllSlots() {
        return slots.values();
    }
    public List<Slot> getAvailableSlots() {
        List<Slot> available=new ArrayList<>();
        for(Slot slot:slots.values()) {
            if (slot.getStatus()==SlotStatus.AVAILABLE) {
                available.add(slot);
            }
        }
        return available;
    }
}