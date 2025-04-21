package org.example;

public class Publication {
    String title;

    int year;

    public Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getInfo(){
        return title+", published in "+year;
    }
}
