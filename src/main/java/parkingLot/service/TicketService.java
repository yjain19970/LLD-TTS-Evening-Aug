package parkingLot.service;

import parkingLot.models.*;
import parkingLot.repository.GateRepository;
import parkingLot.repository.ParkingLotRepository;
import parkingLot.repository.TicketRepository;
import parkingLot.repository.VehicleRepository;
import parkingLot.strategy.ParkingSpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService implements ITicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;
    private ParkingSpotAssignmentStrategy spotAssignmentStrategy;

    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository,
                         TicketRepository ticketRepository,
                         ParkingSpotAssignmentStrategy spotAssignmentStrategy) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
        this.spotAssignmentStrategy  = spotAssignmentStrategy;
    }


    @Override
    public Ticket generateTicket(Long gateId, Long parkingLotId, Vehicle vehicle) throws Exception {
        Optional<ParkingLot> parkingLot =  parkingLotRepository.getParkingLotById(parkingLotId);
        if(parkingLot.isEmpty()){
            throw new Exception();
        }

        Optional<ParkingSpot> parkingSpotOptional = spotAssignmentStrategy.
                findSpot(vehicle.getVehicleType(), parkingLot.get());

        if(parkingSpotOptional.isEmpty()){
            throw new Exception();
        }

        Optional<Gate> gateOptional= gateRepository.getGateById(gateId);
        if(gateOptional.isEmpty()){
            throw new Exception();
        }

        parkingSpotOptional.get().setSpotStatus(SpotStatus.UNAVAILABLE);
        Ticket t  = new Ticket(parkingSpotOptional.get(),
                new Date(),
                vehicle,
                gateOptional.get(),
                gateOptional.get().getCurrentOperator());

        Ticket tSaved = ticketRepository.saveTicket(t);

        return tSaved;
    }















}
