package com.company;

public class Main {

    public static void main(String[] args) {

        //only possible movies are "La La Land", "Wonder Woman", or "Avengers"
        Movie film = new Movie("Avengers");

        System.out.println("You must be at least " + film.getAgeRequirement() + " to watch " + film.getTitle() + ".");
        System.out.println(film.getTitle() + " has a rating of " + film.getRating() + " and a runtime of "+ film.getRuntime() + " minutes.");
        System.out.println("Actors in " + film.getTitle() + ": " + film.getCredits() + ", Genre: " + film.getGenre() + ".");
        System.out.println("Poster: " + film.getCoverPhotoURL() + ", Soundtrack: " + film.getSoundtrack());
    }
}
