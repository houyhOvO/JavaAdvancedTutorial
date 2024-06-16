package com.tut.innerclass;

public class LocalInnerClass {
    private final String name;

    public LocalInnerClass(String name) {
        this.name = name;
    }

    public void test(){
        // Local inner class refers to a class that is created in a method
        class Inner{

        }

        Inner inner = new Inner();

    }
}
