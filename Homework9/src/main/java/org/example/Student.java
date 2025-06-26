package org.example;

public class Student {
    private int year;
    private String name;
    private String major;

    public Student(String name, int year, String major) {
        this.name = name;
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }
}
