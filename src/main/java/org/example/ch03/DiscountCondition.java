package org.example.ch03;

import java.time.DayOfWeek;
import java.time.LocalTime;


public class DiscountCondition {
    private DiscountConditionType type;

    private int sequence; // 상영 순번

    private DayOfWeek dayOfWeek; // 요일
    private LocalTime startTime; // 시작 시간
    private LocalTime endTime; // 종료 시간
    public DiscountConditionType getType() {
        return type;
    }
    //할인 조건이 여러개 추가될 경우
    public boolean isDiscountable(DayOfWeek dayOfWeek, LocalTime time) {
        //할인 조건별로 할인 여부를 판단하는 방법이 변경될 경우
        if(type.equals(DiscountConditionType.PERIOD)){
            //야러 로직~
            return true;
        }
        else if(type.equals(DiscountConditionType.SEQUENCE)){
            return false;
        }
        else{
            return true;
        }

    }

    public boolean isDiscountable(int sequence) {  return true;}

    public void setType(DiscountConditionType type) {
        this.type = type;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
