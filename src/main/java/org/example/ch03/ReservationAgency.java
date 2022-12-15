package org.example.ch03;


public class ReservationAgency {
    //할인 정책이 여러개 생길 경우
    private ReservationAgencyType type;
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        double fee;
        if(type.equals(ReservationAgencyType.type1)){
            //로직로직
            fee = screening.returnMovieFee(null, 1);
        }
        else if(type.equals(ReservationAgencyType.type2)){
            //로직
            fee= 2;
        }
      else {
      fee =0;
      }


        return new Reservation(customer, screening, fee, audienceCount);
    }
}
