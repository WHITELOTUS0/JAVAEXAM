public class Student {
    public String name;
    public int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Student clone = (Student) super.clone();
        clone.name=this.name;
        clone.age=this.age;
        return clone;
    }
}
