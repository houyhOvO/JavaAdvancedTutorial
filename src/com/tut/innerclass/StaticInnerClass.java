package com.tut.innerclass;

public class StaticInnerClass {
    private final String name;
    public StaticInnerClass(String name) {
        this.name = name;
    }

    /*
    This class belongs to the outer class.
    This means we can directly access to the inner class without creating an outer class instance.
     */
    public static class Inner {
        public void test(){
            System.out.println("I am a static inner class.");
        }

    }


    public static void main(String[] args) {
        StaticInnerClass.Inner inner = new StaticInnerClass.Inner();
        inner.test();
    }
}
