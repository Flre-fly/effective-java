package org.example.ch02;

public class PercentDiscountPolicy extends DiscountPolicy{
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition ... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected double getDiscountAmount(Screening screening) {
        return screening.getMovieFee() * percent/100;
    }
}
