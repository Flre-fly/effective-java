package org.example;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public void toSell(Audience audience){
        ticketOffice.toSell(audience);
        //ticketOffice의 내부구혀늘 숨겼다.
    }
    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
