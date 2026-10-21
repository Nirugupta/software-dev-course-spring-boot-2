package com.example.mycollections.models;

public class MusicAlbum extends LibraryItem {
    private String artist;
    private String genre;

    public MusicAlbum(String name, String artist, int year, String genre) {
        super(name, year);
        this.artist = artist;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return name + " by " + artist + " (" + year + ")";
    }
}