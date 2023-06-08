package Cloning;
// Deep cloning
public class Student implements Cloneable{
    public String name;
    public int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Student cloned = (Student) super.clone();
        cloned.name=this.name;
        cloned.age=this.age;
        return cloned;
    }

    public static void main(String[] args) throws Exception {
        Student obj = new Student("Glorry", 20);

        Student obj2 = (Student) obj.clone();
        System.out.println(obj.name);
        System.out.println(obj2.name);

        obj.name = "John";
        obj.age = 30;

        System.out.println(obj.name);
        System.out.println(obj2.name);
    }
}
