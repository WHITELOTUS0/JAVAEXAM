package Serialization;

import java.io.IOException;

public class Serialize {
    public String name;
    public int age;

    Serialize(String name, int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        try{
            Serialize obj = new Serialize("GLORRY", 20);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
