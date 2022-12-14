package org.example;

import org.example.ch02.AmountDefaultDiscountPolicy;
import org.example.ch02.Movie;
import org.example.ch02.NoneDefaultDiscountPolicy;
import org.example.ch02.PercentDefaultDiscountPolicy;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        Movie starWas = new Movie("스타워즈", Duration.ofMinutes(210), 2000, new NoneDefaultDiscountPolicy());

        //합성
        Movie avatar = new Movie("아바타",
                Duration.ofMinutes(120),
                200,
                new AmountDefaultDiscountPolicy());

        avatar.changeDiscountPolicy(new PercentDefaultDiscountPolicy(0.1));
    }
}