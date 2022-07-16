import com.sun.tools.javac.Main;

public class Binary {

    public static void main(String[] args) {
        byte age = 127;
        age = (byte) (age+1);
        System.out.println(age);

        int a = 5; // 0101
        int b = 6; // 0110

        int c = a | b; // 0111
        System.out.println(c);
        int d = a & b; // 0100
        System.out.println(d);

        int e = a ^ b; // 0011
        System.out.println(e);

        int f = ~ a; // 1010
        System.out.println(f);
    }



}
