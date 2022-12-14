package org.example.ch03;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;


    public double returnMovieFee(LocalDateTime whenScreened, int sequence){
        return movie.returnMovieFee(whenScreened, sequence);
    }
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
