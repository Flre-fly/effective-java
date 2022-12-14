package org.example.ch02;

public class PercentDefaultDiscountPolicy extends DefaultDiscountPolicy {
    private double percent;

    public PercentDefaultDiscountPolicy(double percent, DiscountCondition ... conditions) {
        super(conditions);
        this.percent = percent;
    }

    public PercentDefaultDiscountPolicy() {
        super();
    }

    @Override
    protected double getDiscountAmount(Screening screening) {
        return screening.getMovieFee() * percent/100;
    }
}
