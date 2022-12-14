package org.example.ch03;


public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        double fee = screening.returnMovieFee();


        return new Reservation(customer, screening, fee, audienceCount);
    }
}
