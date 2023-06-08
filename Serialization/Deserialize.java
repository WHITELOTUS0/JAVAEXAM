package Serialization;

import java.io.*;

public class Deserialize {
    public static void main(String[] args) {
        try {
            // Deserialization
            FileInputStream fileIn = new FileInputStream("se_file.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            // Read the object
            Serialize deserializedObj = (Serialize) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Object deserialized successfully.");

            System.out.println("Name: " + deserializedObj.name);
            System.out.println("Age: " + deserializedObj.age);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
