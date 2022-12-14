package org.example.ch01;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }
    public Long toSell(Ticket ticket){
        return bag.hold(ticket);
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
