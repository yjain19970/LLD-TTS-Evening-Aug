package parkingLot.strategy;

import parkingLot.models.ParkingLot;
import parkingLot.models.ParkingSpot;
import parkingLot.models.VehicleType;

import java.util.Optional;

public interface ParkingSpotAssignmentStrategy {
    Optional<ParkingSpot> findSpot(VehicleType vehicleType, ParkingLot parkingLot);
}
