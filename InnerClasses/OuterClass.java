package InnerClasses;

public class OuterClass {
    public int age=10;
    public static String name="Glorry";

    public class InnerClass{
        public void printAge(){
            System.out.println("Age is "+age);
            }
    }

    public static class StaticInnerClass{
        public void printName(){
            System.out.println("Age is "+name);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.printAge();
    }
}
