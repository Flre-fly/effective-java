package org.example.ch01;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
       ticketSeller.toSell(audience);
        //ticketSeller의 내부구현을 숨겼다
    }
}
