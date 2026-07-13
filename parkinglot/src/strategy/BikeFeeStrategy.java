package strategy;

import java.time.Duration;

import model.Ticket;

public class BikeFeeStrategy implements FeeStrategy {

    private static final double RATE_PER_HOUR = 10.0;
    
    @Override
    public double calculateFee(Ticket ticket) {
        long hours = Duration.between(
                ticket.getEntryTime(),
                ticket.getExitTime()
        ).toHours();
        if (hours == 0) {
            hours = 1;
        }
        return hours * RATE_PER_HOUR;
    }
}