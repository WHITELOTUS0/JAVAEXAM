public class Person implements Cloneable{
    private String name;

    Person(String name){
        this.name=name;
    }

    public static void main(String[] args) throws Exception{
        Person obj = new Person("Glorry");
        Person obj2 = (Person)obj.clone();
        System.out.println(obj.name);
        System.out.println(obj2.name);
    }
}