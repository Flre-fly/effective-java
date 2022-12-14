package org.example.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {
    List<DiscountCondition> conditions = new ArrayList<>();

    DefaultDiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }
    public double calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) {
            if (each.isSatisfied(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return 0;
    }
    abstract protected double getDiscountAmount(Screening screening);

}
