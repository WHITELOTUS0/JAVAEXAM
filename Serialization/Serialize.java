package Serialization;

import java.io.*;

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
            //Serialization
            FileOutputStream fileOut = new FileOutputStream("se_file.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
