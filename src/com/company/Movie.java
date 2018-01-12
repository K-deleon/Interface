package com.company;

public class Movie implements Movies {
    public String movieInput;
    public int arrayNum;
    public String[] titles = {"La La Land", "Wonder Woman", "Avengers"};
    public String[] genre = {"Musical", "Action", "Action"};
    public String[] credits = {"Emma Stone and Ryan Gosling", "Gal Gadot and Chris Pine", "Robert Downey Jr, Chris Evans, Mark Ruffalo, Chris Hemsworth, Scarllett Johansen, and Jeremy Renner"};
    public int[] ratings = {10,10,10};
    public int[] runtime = {128,141,143};
    public int[] ageRequirement = {13,13,13};
    public String[] soundtracks = {"https://www.youtube.com/watch?v=MmKlaGpmYig"
            ,"https://www.youtube.com/watch?v=puEi1ZFPwFo&list=PLBKadB95sF46NHnrQyDN0kIbvk6dbiDhI"
            , "https://www.youtube.com/watch?v=sqx0ApdjvR8&list=PLIR18qtLNtiyCnPeHimoeHdV6YIUX4I8d"};
    public String[] coverPhoto = {"https://upload.wikimedia.org/wikipedia/en/a/ab/La_La_Land_%28film%29.png"
            ,"https://vignette.wikia.nocookie.net/dccu/images/6/6f/JL_Wonder_Woman.jpg/revision/latest?cb=20160914003449"
            ,"https://upload.wikimedia.org/wikipedia/en/f/f9/TheAvengers2012Poster.jpg"};

    public Movie(String s){
        movieInput = s;
        if(movieInput.equalsIgnoreCase("La La Land")){
            arrayNum = 0;
        } else if(movieInput.equalsIgnoreCase("Wonder Woman")){
            arrayNum = 1;
        } else if(movieInput.equalsIgnoreCase("Avengers")){
            arrayNum = 2;
        } else {
            System.out.println("No Data");
        }
    }

    public int getRuntime() {
        return runtime[arrayNum];
    }


    public int getRating() {
        return ratings[arrayNum];
    }


    public int getAgeRequirement() {
        return ageRequirement[arrayNum];
    }


    public String getSoundtrack() {
        return soundtracks[arrayNum];
    }


    public String getCredits() {
        return credits[arrayNum];
    }


    public String getTitle() {
        return titles[arrayNum];
    }


    public String getCoverPhotoURL() {
        return coverPhoto[arrayNum];
    }


    public String getGenre() {
        return genre[arrayNum];
    }
}
