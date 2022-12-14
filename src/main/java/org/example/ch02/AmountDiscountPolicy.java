package org.example.ch02;

public class AmountDiscountPolicy extends DiscountPolicy{
    private int discountAmount;
    @Override
    public double getDiscountAmount(Screening screening){
        return discountAmount;
    }

}
