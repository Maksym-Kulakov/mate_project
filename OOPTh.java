public class OOPTh {
    private double baseSalary;

    //OOP - method to appr Object
    public OOPTh (double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary * 1.1;
    }

    public static void main(String[] args) {
        OOPTh bob = new OOPTh(100);
        System.out.println(bob.getBaseSalary());

        System.out.println(OOPTh.getSalary(100));
    }

    // procedure - method as Abstraction
    public static double getSalary (double baseSalary) {
        return baseSalary * 1.1;
    }

}
