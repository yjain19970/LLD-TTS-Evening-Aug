package parkingLot.service;

import parkingLot.models.Ticket;
import parkingLot.models.Vehicle;

public interface ITicketService {
    Ticket generateTicket(Long gateId, Long parkingLotId, Vehicle vehicle) throws Exception;
}
