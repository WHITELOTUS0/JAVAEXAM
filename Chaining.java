public class Chaining {
    Chaining(){
        this(5);
        System.out.println("No arg constructor");
    }

    Chaining(int x){
        this("Kampala", 20);
        System.out.println("One Arg Constructor : " +x);
    }
}
