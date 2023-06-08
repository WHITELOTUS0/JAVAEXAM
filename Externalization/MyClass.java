package Externalization;

import java.io.*;

public class MyClass implements Externalizable{
    public String name;
    public int age;

    public MyClass(){}

    MyClass(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException{
        out.writeObject(name);
        out.writeInt(age);
    }

    
}
