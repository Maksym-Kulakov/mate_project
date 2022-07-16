public class BinaryPr2 {

    public static int getDoubledNumber(int number) {
        return number << 1;
    }

    public String toBinaryString(int value) {
        StringBuilder sb = new StringBuilder();
        if (value == 0) {
            return "0";
        }
        while (value != 0) {
            sb.append(value % 2);
            value /= 2;
        }
        return sb.reverse().toString();
        }


    public static void main(String[] args) {

            System.out.println(new BinaryPr2().toBinaryString( 1));
            //write code above this line
        }
}
