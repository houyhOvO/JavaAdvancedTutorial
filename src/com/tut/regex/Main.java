package com.tut.regex;

public class Main {
    public static void main(String[] args) {
        String s1 = "oooo";
        System.out.println(s1.matches("o+")); // "+" means matching the preceding character once or more times

        String s2 = "aaaa";
        System.out.println(s2.matches("o*a+")); //"*" means matching the preceding character zero or more times

        String s3 = "ooo";
        System.out.println(s3.matches("o{3}")); // {n}: n is a non-negative integer, meaning matching a certain number of times

        String s4 = "babcab";
        System.out.println(s4.matches("[abc]*"));
    }
}
