import java.util.Arrays;
import java.util.Random;

public class OOPTh {
    private double baseSalary;

    OOPTh(){

    }

    //OOP - method to appr Object
    public OOPTh (double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary * 1.1;
    }

    //random enam
    public OOPTh_Enam getSeason () {
        int index = new Random().nextInt(OOPTh_Enam.values().length);
        return  OOPTh_Enam.values()[index];
    }

    public static void main(String[] args) {
        OOPTh bob = new OOPTh(100);
        System.out.println(bob.getBaseSalary());

        System.out.println(OOPTh.getSalary(100));

        //with ENAM

        OOPTh_Enam spring = OOPTh_Enam.SPRING;
        System.out.println(spring);

        OOPTh_Enam[] values = OOPTh_Enam.values();
        System.out.println(Arrays.toString(values));

        //Random

        Random random = new Random();
        int value = random.nextInt(100);
        System.out.println(value);

        //Random + Enam
        OOPTh season = new OOPTh();
        System.out.println(season.getSeason());

    }





    // procedure - method as Abstraction
    public static double getSalary (double baseSalary) {
        return baseSalary * 1.1;
    }

}
