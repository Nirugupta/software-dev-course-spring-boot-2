package com.example.mycollections.models;

public class Movie extends LibraryItem {
    private String director;
    private int runtimeMinutes;

    public Movie(String name, String director, int year, int runtimeMinutes) {
        super(name, year);
        this.director = director;
        this.runtimeMinutes = runtimeMinutes;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRuntimeMinutes() {
        return runtimeMinutes;
    }

    public void setRuntimeMinutes(int runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }

    @Override
    public String toString() {
        return name + " directed by " + director + " (" + year + ")";
    }
}