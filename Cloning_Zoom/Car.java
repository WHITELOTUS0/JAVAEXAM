package Cloning_Zoom;

public class Car implements Cloneable{
    String name;
    int year;

    Car(String name, int year){
        this.name = name;
        this.year = year;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Car car1 = new Car("BMW", 2019);
        Car car2 = (Car)car1.clone();
        System.out.println(car1.name + " " + car1.year);
        System.out.println(car2.name + " " + car2.year);
    }
}

//Shallow Cloning
