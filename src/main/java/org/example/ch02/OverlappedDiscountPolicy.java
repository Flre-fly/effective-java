package org.example.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappedDiscountPolicy implements DiscountPolicy {
    private List<DiscountPolicy> discountPolicies = new ArrayList<>();

    public OverlappedDiscountPolicy(DiscountPolicy ...discountPolicies) {
        this.discountPolicies = Arrays.asList(discountPolicies);
    }
    @Override
    public double calculateDiscountAmount(Screening screening) {
        double result = 0;
        for(DiscountPolicy each : discountPolicies) {
            result = result + each.calculateDiscountAmount(screening);
        }

        return result;
    }
}
