package org.example.ch02;

import java.time.Duration;
import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public boolean withinThePeriod(Duration duration){
        //duration이 whenScreened 내부에 있으면 true를 아니면 false를 반환한다
        return false;
    }
    public boolean withinTheSequence(int sequence){
        if(sequence< this.sequence) return true;
        else return false;
    }
    public LocalDateTime getStartTime() { // 상영 시작 시간
        return whenScreened;
    }

    public boolean isSequence(int sequence) { // 순번의 일치 여부 검사
        return this.sequence == sequence;
    }

    public int getMovieFee() { // 기본 요금을 반환
        return movie.getFee();
    }
}
