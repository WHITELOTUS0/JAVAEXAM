public class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Animal obj = new Dog();//Upcasting
        obj.eat();
        Dog obj2 = (Dog)obj;//Downcasting
        obj2.bark();
        
    }
}
