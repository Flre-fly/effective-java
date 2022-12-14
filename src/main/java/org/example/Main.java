package org.example;

import org.example.ch02.*;
import org.example.ch06.Event;
import org.example.ch06.RecurringSchedule;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Movie avatar = new Movie("아바타",
                Duration.ofMinutes(120),
                200,
                new OverlappedDiscountPolicy(
                        new AmountDefaultDiscountPolicy(), new PercentDefaultDiscountPolicy()
  )
);
    }
}