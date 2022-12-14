package org.example;

import org.example.ch02.Movie;
import org.example.ch02.NoneDiscountPolicy;
import org.w3c.dom.Node;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        Movie starWas = new Movie("스타워즈", Duration.ofMinutes(210), 2000, new NoneDiscountPolicy());

    }
}