package org.example.ch02;

public class NoneDefaultDiscountPolicy implements DiscountPolicy {
    @Override
    public double calculateDiscountAmount(Screening screening) {
        return 0;
    }
}
