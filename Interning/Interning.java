package Interning;

public class Interning {
    public static void main(String[] args) {
        String s = "Kato";
        String s1 = "Kato";

        System.out.println(s==s1);
        String s2 = new String("Kato").intern();
        System.out.println(s1==s2);
    }
}
