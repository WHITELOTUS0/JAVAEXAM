package Anonymous;

public interface MyInterface {
    public void doSomething();
}

class MyClass{
    MyInterface obj = new MyInterface() {
        public void doSomething(){
            System.out.println("doing something");
        }
        
    };
    

    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        myclass.obj.doSomething();
    }
}
