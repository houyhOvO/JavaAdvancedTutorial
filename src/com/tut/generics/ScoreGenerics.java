package com.tut.generics;

public class ScoreGenerics<T> {
    String name;
    String id;
    T value;

    public ScoreGenerics(String name, String id, T value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    public static void main(String[] args) {
        ScoreGenerics<String> score1 = new ScoreGenerics<>("Math", "04543", "Highly Distinct");
        ScoreGenerics<? extends Number> score2 = new ScoreGenerics<>("COMP1110", "04343", 80.6);
        ScoreGenerics<? super Object> score3 = new ScoreGenerics<>("COMP6442", "04543", 65);
    }
}
