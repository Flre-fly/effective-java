package org.example.ch02;

public class NoneDiscountPolicy extends DiscountPolicy{
    @Override
    protected double getDiscountAmount(Screening screening) {
        return 0;
    }
}
