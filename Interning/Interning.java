package Interning;

public class Interning {
    public static void main(String[] args) {
        String s = "Kato";
        String s1 = "Kato";

        System.out.println(s==s1);
        String s2 = new String("Kato").intern();
        System.out.println(s1==s2);

        String m = new String("Kampala");
        String n = new String("Kampala");
        System.out.println(m==n);
    }
}
