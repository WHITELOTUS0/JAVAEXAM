public class Chaining {
    Chaining(){
        this(5);
        System.out.println("No arg constructor");
    }

    Chaining(int x){
        this("Kampala", 20);
        System.out.println("One Arg Constructor : " +x);
    }

    Chaining(String district, int age){
        System.out.println("I am from "+ district + " And I am " + age+" years old");
    }

    public static void main(String[] args) {
        new Chaining();
    }
}
