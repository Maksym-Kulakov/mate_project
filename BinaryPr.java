public class BinaryPr {

    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        //write code below this line


        return (a && b && !c && !d) || (a && c && !b && !d ) || (a && d && !b && !c) || (b && c && !a && !d) || (b&&d && !a && !c)|| (c&&d && !a && !b);

    }
    public static void main(String[] args) {

            System.out.println(new BinaryPr().booleanExpression(false, false, true, true));
            //write code above this line
        }





}
