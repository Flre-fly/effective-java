package org.example;

public class Ticket {
    private Long fee;

    public Long getFee() {
        return fee;
    }
    public Long spendAmount(Audience audience){
        if(audience.toSell(this)) return 0l;//티켓으로 들어온 경우
        else return getFee();//지불한 현급

    }
}
