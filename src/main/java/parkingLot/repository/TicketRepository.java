package parkingLot.repository;

import parkingLot.models.Ticket;

import java.util.Map;

public class TicketRepository {
    private Map<Long, Ticket> ticketMap;
    private long lastUsedId = 0L;

    public TicketRepository(Map<Long, Ticket> ticketMap) {
        this.ticketMap = ticketMap;
    }


    // select * from ticket where ticket_id=id;
    public Ticket getTicketById(Long ticketId) {
        return ticketMap.get(ticketId);
    }

    public Ticket saveTicket(Ticket t) {
        lastUsedId++;

        t.setId(lastUsedId);
        ticketMap.put(lastUsedId, t);
        return ticketMap.get(lastUsedId);
    }


}
