public class Person implements Cloneable {
    private String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age=20;
    }

   
    
    public static void main(String[] args) throws Exception {
        Person obj = new Person("Glorry", 20);
        
        Person obj2 = (Person) obj.clone();
        System.out.println(obj.name);
        System.out.println(obj2.name);

       

    }
}