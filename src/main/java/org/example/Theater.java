package org.example;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) { // 초대장이 있으면
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket); // 판매원이 티켓을 준다.
        } else { // 초대장이 없으면
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee()); // 관람객이 돈을 지불한다.
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee()); // 판매원이 돈을 받는다.
            audience.getBag().setTicket(ticket); // 티켓을 준다.
        }
    }
}
