package Serialization;

import java.io.*;

public class Deserialize {
    try {
        //Deserialization
        FileInputStream fileIn = new FileInputStream("se-file.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        //Read the object


    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
}
