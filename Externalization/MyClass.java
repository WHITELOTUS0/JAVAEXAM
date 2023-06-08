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

    @Override
    public void readExternal(ObjectInput in) throws IOException ,ClassNotFoundException{
        name=(String)in.readObject();
        age=in.readInt();
    }

    public static void main(String[] args) {
        try{
            MyClass myClass=new MyClass("Glorry",20);
            FileOutputStream fileOutputStream=new FileOutputStream("myClass.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(myClass);
            objectOutputStream.close();

        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            FileInputStream fileInputStream=new FileInputStream("myClass.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            MyClass myClass=(MyClass)objectInputStream.readObject();
            System.out.println(myClass.name);
            System.out.println(myClass.age);
            objectInputStream.close();
        }catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    
}
