package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount; // 판매 금액
    private List<Ticket> tickets = new ArrayList<>(); // 티켓의 목록

    public TicketOffice(Long amount, Ticket ...tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }
    public void toSell(Audience audience){
        plusAmount(getTicket().spendAmount(audience)); // 판매원이 돈을 받는다.
    }

    public Ticket getTicket() {
        return tickets.remove(0); // 편의를 위해 tickets 컬렉션의 맨 첫 번째 위치에 저장된 티켓을 반환
    }

    public void minusAmount(Long amount) { // 판매 금액을 더한다.
        this.amount -= amount;
    }

    public void plusAmount(Long amount) { // 판매 금액을 차감
        this.amount += amount;
    }
}
