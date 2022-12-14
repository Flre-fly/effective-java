package org.example.ch02;

public class AmountDefaultDiscountPolicy extends DefaultDiscountPolicy {
    private int discountAmount;
    @Override
    public double getDiscountAmount(Screening screening){
        return discountAmount;
    }

}
