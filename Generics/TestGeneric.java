package Generics;

import java.util.*;

public class TestGeneric {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Glorry");
        names.add("Sibo");
        System.out.println(names.get(0));
    }

    public <Y extends Number> int m(Y time){
        return time.intValue() * time.intValue();
    }
}
