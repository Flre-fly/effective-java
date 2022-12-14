package org.example.ch03;

public class Reservation {
    private Customer customer;
    private Screening screening;
    private double fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, double fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
