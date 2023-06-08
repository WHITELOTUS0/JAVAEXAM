package Casting_Zoom;

public class Child extends Parent{
    public void child(){
        System.out.println("From Child class");
    }

    public void parent(){
        System.out.println("Parent Method From Child  Class");
    }

    public static void main(String[] args) {
        Parent obj = new Child();//Upcasting  Parent obj = new Parent();
        obj.parent();


        Child obj2 = (Child)obj;//Downcasting  Child obj2 = new Child();
        obj2.child();
    }
}
