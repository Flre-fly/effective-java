package org.example;

public class Bag {
    private Long amount; // 현금
    private Invitation invitation; // 초대장
    private Ticket ticket; // 티켓

    public Bag (long amount) {// 현금만
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) { // 초대장과 현금
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() { // 초대장 보유여부 확인
        return invitation != null;
    }

    public boolean hasTicket() { // 티켓 보유여부 확인
        return ticket != null;
    }

    public void setTicket(Ticket ticket) { // 초대장을 티켓으로 교환
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) { // 현금 감소
        this.amount -= amount;
    }

    public void plusAmount(Long amount) { // 현금 증가
        this.amount += amount;
    }
}
