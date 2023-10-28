package parkingLot;

import parkingLot.controller.PaymentController;
import parkingLot.controller.TicketController;
import parkingLot.dto.TicketRequestDTO;
import parkingLot.dto.TicketResponseDTO;
import parkingLot.models.Payment;
import parkingLot.repository.GateRepository;
import parkingLot.repository.ParkingLotRepository;
import parkingLot.repository.TicketRepository;
import parkingLot.repository.VehicleRepository;
import parkingLot.service.ITicketService;
import parkingLot.service.TicketService;
import parkingLot.strategy.ParkingSpotAssignmentStrategy;
import parkingLot.strategy.RandomSpotAssignment;

import java.util.HashMap;
import java.util.Random;

public class Client {

    public static void main(String[] args) throws Exception {
        GateRepository gateRepository = new GateRepository(new HashMap<>());
        VehicleRepository vehicleRepository = new VehicleRepository(new HashMap<>());
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository(new HashMap<>());
        TicketRepository ticketRepository = new TicketRepository(new HashMap<>());
        ParkingSpotAssignmentStrategy strategy = new RandomSpotAssignment();

        ITicketService iTicketService = new TicketService(gateRepository,
                vehicleRepository,
                parkingLotRepository,
                ticketRepository,
                strategy);


        TicketController tc = new TicketController(iTicketService);

        TicketResponseDTO dto = tc.generateTicket(new TicketRequestDTO());

        // Admin should be able to create a parkingLOt
        //ParkingLotController --> createParkingLot(dto);
        // ParkingLotService --> createParkingLot(ParkingFloors, ParkingSpots, ...);
        // ParkingLOtRepository --> save(ParkingLot);


    }
}
