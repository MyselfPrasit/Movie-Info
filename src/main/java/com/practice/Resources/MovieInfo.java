package com.practice.Resources;

public class MovieInfo {

    private String movieId;
    private String movieName;
    private String genre;

    public String getMovieId() {
        return movieId;
    }

    public MovieInfo(String movieId, String movieName, String genre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
    }

    public MovieInfo() {
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
