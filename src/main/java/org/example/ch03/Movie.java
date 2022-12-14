package org.example.ch03;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class Movie {
    private String title; // 제목
    private Duration runningTime; // 상영시간
    private double fee; // 기본 요금
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private double discountAmount;
    private double discountPercent;

    public double returnMovieFee(){
        if (isDiscount()) { // 할인 여부
            double discountAmount = 0;
            // 할인 정책에 따라 예매 요금 계산
            switch(getMovieType()) {
                case AMOUNT_DISCOUNT:
                    // 금액 할인 정책
                case PERCENT_DISCOUNT:
                    // 할인 비율
                case NONE_DISCOUNT:
                    // 할인 정책이 적용 x
            }

            fee = getFee() - discountAmount;
        } else {
            fee = getFee();
        }
        return fee;
    }
    public boolean isDiscount(){
        boolean discountable = false;
        for (DiscountCondition condition : getDiscountConditions()) {
            if (condition.getType() == DiscountConditionType.PERIOD) {
                // 기간 조건
            } else {
                // 순번 조건
            }

            if (discountable) {
                break;
            }
        }
        return discountable;

    }
    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public double getFee() {
        return fee;
    }

    public List<DiscountCondition> getDiscountConditions() {
        return Collections.unmodifiableList(discountConditions);
    }

    public void setDiscountConditions(List<DiscountCondition> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
}
