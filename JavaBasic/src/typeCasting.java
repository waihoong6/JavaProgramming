public class typeCasting {
    public static void main (String[] args) {

        //WIDENING CASTING
        /*
        (done automatically)

        byte -> short -> char -> int -> long -> float -> double
        */

        //NARROWING CASTING
        /*
        (done manually)

        double -> float -> long -> int -> char -> short -> byte
        */


        //EXAMPLE OF WIDENING CASTING
        int x = 12;
        double y = x; 

        System.out.println(x);
        System.out.println(y);


        //EXAMPLE OF NARROWING CASTING
        double a = 1.23;
        int b = (int)a;

        System.out.println(a);
        System.out.println(b);
    }
}
