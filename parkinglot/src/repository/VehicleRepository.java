package repository;
import model.Vehicle;

import java.util.*;

public class VehicleRepository {
	private final HashMap<String,Vehicle> vehicles;
	
	public VehicleRepository() {
		this.vehicles=new HashMap<>();
	}
	public void addVehicle(Vehicle vehicle) {
		vehicles.put(vehicle.getVehicleNumber(),vehicle);
	}
	public Vehicle getVehicle(String vehicleNumber) {
		return vehicles.get(vehicleNumber); 
	}
	public void removeVehicle(String vehicleNumber) {
		vehicles.remove(vehicleNumber);
	}
	public boolean containsVehicle(String vehicleNumber) {
		return vehicles.containsKey(vehicleNumber);
	}
	public Collection<Vehicle> getAllVehicles(){
		return vehicles.values();
	}	
}
