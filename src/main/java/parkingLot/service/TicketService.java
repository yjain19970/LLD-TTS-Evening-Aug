package parkingLot.service;

import parkingLot.dto.TicketRequestDTO;
import parkingLot.dto.TicketResponseDTO;
import parkingLot.models.Ticket;
import parkingLot.models.Vehicle;

public class TicketService implements ITicketService {


    @Override
    public Ticket generateTicket(Long gateId, Long parkingLotId, Vehicle vehicle) {
        /**
         * 1. get parkingLot from parking_lot_id from DB
         * 2. get the gate detils using gate_id from DB
         * 3. assign a spot to vehicle
         * 4. create the ticket
         */


        /**
         *     private ParkingSpot parkingSpot; --> parkingLot --> by parkingLotId
         *     private Date entryTime; --> new Date();
         *     private Vehicle vehicle; Yes
         *     private Gate gate; --> fetch Gate frm GateId.
         *     private Operator operator; --> get the operator.
         */


        // generate the ticket
        // store ticket in DB
        // reutrn ticket
        return null;
    }















}
