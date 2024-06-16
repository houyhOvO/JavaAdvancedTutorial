package com.tut.innerclass;

public abstract class AnonymousInnerClass {
    public abstract void test();

    public static void main(String[] args) {
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass() {
            @Override
            public void test() {
                System.out.println("I am an anonymous inner class.");
            }
        };
        anonymousInnerClass.test();
    }
}
