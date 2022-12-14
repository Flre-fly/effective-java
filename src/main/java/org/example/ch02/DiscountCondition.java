package org.example.ch02;

import java.time.Duration;

public abstract class DiscountCondition {
    abstract boolean isSatisfied(Screening screening);

    //인자가 달라서 못씀
}
