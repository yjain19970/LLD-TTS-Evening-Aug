package parkingLot.strategy;

import parkingLot.models.*;

import java.util.Optional;

public class RandomSpotAssignment implements ParkingSpotAssignmentStrategy{
    @Override
    public Optional<ParkingSpot> findSpot(VehicleType vehicleType, ParkingLot parkingLot) {

        for(ParkingFloor floor : parkingLot.getParkingFloors()){ // floor
            for(ParkingSpot spot : floor.getParkingSpots()){ // spots

                if(isSpotAvailable(vehicleType, spot)){
                    return Optional.of(spot);
                }
            }
        }
        return Optional.empty();
    }

    private boolean isSpotAvailable(VehicleType vehicleType, ParkingSpot spot) {
        return spot.getSpotStatus().equals(SpotStatus.AVAILABLE) &&
                spot.getSupportedVehicleType().equals(vehicleType);
    }
}
