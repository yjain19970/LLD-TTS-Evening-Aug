package parkingLot.strategy;

import parkingLot.models.ParkingLot;
import parkingLot.models.ParkingSpot;
import parkingLot.models.VehicleType;

import java.util.Optional;

public class NearestSpotAssignment implements ParkingSpotAssignmentStrategy {
    @Override
    public Optional<ParkingSpot> findSpot(VehicleType vehicleType, ParkingLot parkingLot) {
        return Optional.empty();
    }
}
