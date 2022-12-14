package org.example.ch03;


public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Movie movie = screening.getMovie();

        boolean discountable = false;
        // DiscountCondition에 대해 루프를 돌면서 할인 가능 여부를 확인
        for (DiscountCondition condition : movie.getDiscountConditions()) {
            if (condition.getType() == DiscountConditionType.PERIOD) {
                // 기간 조건
            } else {
                // 순번 조건
            }

            if (discountable) {
                break;
            }
        }

        double fee;
        if (discountable) { // 할인 여부
            double discountAmount = 0;
            // 할인 정책에 따라 예매 요금 계산
            switch(movie.getMovieType()) {
                case AMOUNT_DISCOUNT:
                    // 금액 할인 정책
                case PERCENT_DISCOUNT:
                    // 할인 비율
                case NONE_DISCOUNT:
                    // 할인 정책이 적용 x
            }

            fee = movie.getFee() - discountAmount;
        } else {
            fee = movie.getFee();
        }

        return new Reservation(customer, screening, fee, audienceCount);
    }
}
