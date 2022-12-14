package org.example.ch02;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class DurationCondition extends DiscountCondition{

    private DayOfWeek dayOfWeek; // 요일
    private LocalTime startTime; // 시작 시간
    private LocalTime endTime; // 종료 시간

    boolean isSatisfied(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
                endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0;

    }
}
