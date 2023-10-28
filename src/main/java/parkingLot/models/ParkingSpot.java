package parkingLot.models;

import java.util.List;

public class ParkingSpot extends BaseModel  {
    private int number;
    private VehicleType supportedVehicleType;
    private SpotStatus spotStatus;
    private Vehicle vehicle;

    public ParkingSpot(int number, VehicleType supportedVehicleType, SpotStatus spotStatus, Vehicle vehicle) {
        this.number = number;
        this.supportedVehicleType = supportedVehicleType;
        this.spotStatus = spotStatus;
        this.vehicle = vehicle;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public SpotStatus getSpotStatus() {
        return spotStatus;
    }

    public void setSpotStatus(SpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleType getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(VehicleType supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }
}
