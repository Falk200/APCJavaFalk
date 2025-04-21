package org.example;

public class Book extends Publication {
     String author;

     @Override
    public String getInfo(){
        return super.getInfo()+", by "+author;
    }

    public Book(String title, int year, String author){
        super(title, year);
        this.author = author;
    }
}
