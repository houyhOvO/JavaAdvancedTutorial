package com.tut.innerclass;

public class MemberInnerClass {

    private final String name;

    public MemberInnerClass(String name) {
        this.name = name;
    }

    /*
    This class belongs to an instance, not the outer class.
    This means we must create an instance to access the inner class.
     */
    public class Inner {
        public void test(){
            System.out.println("I am a member inner class, my name is" + name);
        }
    }

    public static void main(String[] args) {
        MemberInnerClass memberInnerClass = new MemberInnerClass(" member inner class");
        MemberInnerClass.Inner inner = memberInnerClass.new Inner();
        inner.test();
    }
}
