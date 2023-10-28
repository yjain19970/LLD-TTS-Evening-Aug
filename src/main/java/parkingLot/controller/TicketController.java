package parkingLot.controller;

import parkingLot.dto.TicketRequestDTO;
import parkingLot.dto.TicketResponseDTO;
import parkingLot.models.Ticket;
import parkingLot.models.Vehicle;
import parkingLot.service.ITicketService;

public class TicketController {
    private ITicketService ticketService;

    public TicketController(ITicketService ticketService) {
        this.ticketService = ticketService;
    }

    public TicketResponseDTO generateTicket(TicketRequestDTO dto) throws Exception {
        Ticket ticket = ticketService.generateTicket(dto.getGateId(),
                dto.getParkingLotId(),
                new Vehicle(dto.getVehicle().getVehicleNumber(),
                        dto.getVehicle().getVehicleType()));


        TicketResponseDTO responseDTO = mapTicketToResponseDTO(ticket);
        return responseDTO;
    }

    private TicketResponseDTO mapTicketToResponseDTO(Ticket ticket) {
        return new TicketResponseDTO();
    }
}
