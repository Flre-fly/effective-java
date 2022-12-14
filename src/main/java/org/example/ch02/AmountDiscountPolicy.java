package org.example.ch02;

public class AmountDiscountPolicy extends DiscountPolicy{
    @Override
    void discount(Movie movie, int amount) {
        movie.discountByAmount(amount);
    }
}
