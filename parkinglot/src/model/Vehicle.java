package model;
import enums.VehicleType;

public class Vehicle {
	
	private String vehicleNumber;
	private VehicleType vehicleType;
	
	public Vehicle(String vNum,VehicleType vType) {
		this.vehicleNumber=vNum;
		this.vehicleType=vType;
	}
	public String getVehicleNumber() {
		return this.vehicleNumber;
	}
	public VehicleType getVehicleType() {
		return this.vehicleType;
	}
	public String toString() {
		return this.vehicleNumber+" "+this.vehicleType;
	}
}
