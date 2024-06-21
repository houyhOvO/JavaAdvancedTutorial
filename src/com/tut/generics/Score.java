package com.tut.generics;

public class Score {
    String name;
    String id;
    Object score; // Object class is super class of all classes, therefore, it can store either integer or string.
    public Score(String name, String id, Object score){
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public static void main(String[] args) {
        Score score1 = new Score("Math", "04543", "Highly Distinct");
        Score score2 = new Score("Data Structure", "04543", 78);

        // Integer number = (Integer) score1.score; // However, this line may throw ClassCastException.
    }
}
