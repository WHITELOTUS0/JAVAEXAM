package Casting_Zoom;

public class Child extends Parent{
    public void child(){
        System.out.println("From Child class");
    }

    public static void main(String[] args) {
        Parent obj = new Child();//Upcasting
        obj.parent();

        Child obj2 = (Child)obj;//Downcasting
        obj2.child();
    }
}
