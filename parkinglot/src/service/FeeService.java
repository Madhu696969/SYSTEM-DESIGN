package service;

import java.util.HashMap;
import java.util.Map;

import enums.VehicleType;
import model.Ticket;
import strategy.BikeFeeStrategy;
import strategy.CarFeeStrategy;
import strategy.FeeStrategy;
import strategy.TruckFeeStrategy;

public class FeeService {
    private final Map<VehicleType, FeeStrategy> strategies;
    public FeeService(){
        strategies = new HashMap<>();
        strategies.put(VehicleType.CAR, new CarFeeStrategy());
        strategies.put(VehicleType.BIKE, new BikeFeeStrategy());
        strategies.put(VehicleType.TRUCK, new TruckFeeStrategy());
    }
    public double calculateFee(Ticket ticket) {
        VehicleType type = ticket.getVehicle().getVehicleType();
        FeeStrategy strategy = strategies.get(type);
        return strategy.calculateFee(ticket);
    }
}