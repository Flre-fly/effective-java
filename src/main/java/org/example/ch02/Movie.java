package org.example.ch02;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title; // 제목
    private Duration runningTime; // 상영시간
    private int fee; // 기본 요금
    private DiscountPolicy discountPolicy; // 할인 정책

    //할인정책을 처음에 생성자로 넣어준다

    public int discountByAmount(int amount){
        return fee - amount;
    }
    public int discountByPercent(int percent){
        return fee * percent/100;
    }
    public int getFee() {
        return fee;
    }

}
