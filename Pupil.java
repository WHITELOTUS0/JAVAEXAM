//Superclass is School
public class Pupil extends School{
    Pupil(){
        super("Kampala");
        System.out.println("From sub class constructor");
    }
    public static void main(String[] args) throws Exception{
        new Pupil();
        Thread.sleep(5000);
    }
}
