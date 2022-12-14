package org.example;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }
    public boolean toSell(Ticket ticket){
        if (hasInvitation()) { // 초대장이 있으면
            setTicket(ticket); // 판매원이 티켓을 준다.
            return true;
        } else { // 초대장이 없으면
            bag.minusAmount(ticket.getFee()); // 관람객이 돈을 지불한다.

            setTicket(ticket); // 티켓을 준다.
            return false;
        }
    }
    public void setTicket(Ticket ticket){
        bag.setTicket(ticket);
    }
    public boolean hasInvitation(){
        return bag.hasInvitation();
    }
    public Bag getBag() { // 관람객은 가방을 소지할 수 있다.
        return bag;
    }
}
