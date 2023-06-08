package NestedClasses;

public class OuterClass {
    public int age =20;

    public class InnerClass{
        static int h = 20;
        public static void doSomething(){
            System.out.println("Inner class");
        }
    }

    public static class StaticInner{
        public void doSomething(){
            System.out.println("Static Inner class");
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass obj = outer.new InnerClass();
        InnerClass.doSomething();
        OuterClass.StaticInner obj2 = new OuterClass.StaticInner();
        obj2.doSomething();
    }
}
