import java.util.Scanner;

public class operatorExample {
    public static void main (String[] args) 
    {
        /*
        basic operator in java includes '=', '+', '-', '*', '/', '%', and etc.
        Which it will not be included in the codes below

        this class will focus on providing example for operators like
        +=, -=, *=, /=, ==, !=, and etc.
        */

        //+=
        System.out.println("--------------------------------------------");
        int a = 10;
        a += 5; //if you expand this it means x = x+5; x = 10+5; 
        System.out.println("Output of a is" + " " + a);

        //-=
        System.out.println("--------------------------------------------");
        int b = 15;
        b -= 5; //if you expand this it means x = x-5; x = 15-5;
        System.out.println("Output of b is" + " " + b);
        System.out.println("--------------------------------------------");
        //same goes to *= as well as /=

        /*
        following examples are the COMPARISON OPERATORS in java
        which includes ==, !=, >, <, >=, <=
        */

        //== (equals)
        System.out.println("\n");
        
        int c = 2;
        int d = 3;

        boolean falseEquals = (c==d);
        boolean trueEquals = (c==c);

        System.out.println("C is" + " " + c);
        System.out.println("D is" + " " + d);

        System.out.println("\n");
        System.out.println("------------------------Equals-------------------------");

        System.out.println("Does 2 has the same value as 3:" + " " + falseEquals);
        System.out.println("Does 2 has the same value as 2" + " " + trueEquals);

        //!= (NOT equals)
        boolean notEqual = (c!=d);
        boolean falseNotEqual = (c!=c);

        System.out.println("---------------------Not Equal-------------------------");
        System.out.println("Does 2 has the same value as 3:" + " " + notEqual);
        System.out.println("Does 2 has the same value as 2:" + " " + falseNotEqual);

        boolean falseGreaterThan = (c>d);
        boolean greaterThan = (d>c);
        System.out.println("---------------------Greater than----------------------");
        System.out.println("Is c greater than d:" + " " + falseGreaterThan);
        System.out.println("Is d greater than c:" + " " + greaterThan);

        /* 
        following are examples of LOGICAL OPERATORS in Java
        which includes &&, ||, and !
        */

        //&& will ONLY return true IF BOTH of the statements are true
        //|| will return true IF EITHER ONE of the statment is true
        //! will reverse the result. it will return true if the result is false, vice versa

        System.out.println("----------------------&& Operator----------------------");
        System.out.println("Comparing C AND D:" + ((c<1) && (d<1))); //both are true
        System.out.println("----------------------|| Operator----------------------");
        System.out.println("Comparing C OR D:" + ((c<2) || (d<1))); //d is true
        System.out.println("-----------------------! Operator----------------------");
        System.out.println("! Operator:" + !((c<2) || (d<1))); //reverse the result from true to false
    }
}
