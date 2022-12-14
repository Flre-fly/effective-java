package org.example.ch02;

import java.time.Duration;

public class DurationCondition extends DiscountCondition{

    boolean isSatisfied(Screening screening, Duration duration) {
        if(screening.withinThePeriod(duration)) return true;
        return false;
    }
}
