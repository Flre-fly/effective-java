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
