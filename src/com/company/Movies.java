package com.company;

public interface Movies {
    int getRuntime(); // Returns an integer with  the runtime in minutes
    int getRating(); // Rating out of 10 as an integer
    int getAgeRequirement();
    String getSoundtrack(); //Each index has a different song title
    String getCredits();
    String getTitle(); // Returns a string that is the movie title
    String getCoverPhotoURL();
    String getGenre();
}

