package org.example.ch02;

public class PercentDiscountPolicy extends DiscountPolicy{

    @Override
    void discount(Movie movie, int discount) {
        movie.discountByPercent(discount);
    }
}
