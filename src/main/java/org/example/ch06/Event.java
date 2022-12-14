package org.example.ch06;

import java.time.Duration;
import java.time.LocalDateTime;

public class Event {
    private String subject; // 주제
    private LocalDateTime from; // 시작 일시
    private Duration duration; // 소요 시간

    public Event(String subject, LocalDateTime from, Duration duration) {
        this.subject = subject;
        this.from = from;
        this.duration = duration;
    }
    public boolean isSatisfied(RecurringSchedule schedule){
        if(from.getDayOfWeek() != schedule.getDayOfWeek() ||
                !from.toLocalTime().equals(schedule.getFrom()) ||
                !duration.equals(schedule.getDuration())) {
            reschedule(schedule); // reschedule 메서드는 Event 객체의 상태를 수정한다!
            return false;
        }

        return true;
    }
    public void reschedule(RecurringSchedule schedule) {
        from = (LocalDateTime.now());
        duration = schedule.getDuration();
    }
}
