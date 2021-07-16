public class conditionExample {
    public static void main (String[] args) {
        /* 
        Java condition statments are 'if', 'if..else', 'else if', and 'switch'
        */

        //if statement
        for (int i=0; i<5; i++) {
            System.out.print(i + "\t");
            if (i==2) {
                System.out.println("this is 2 and it is terminating the loop"); //if i is 2, then this will be executed
                break; //break will terminate the loop without going further than 2.
            }
        }

        //if..else statement
        for (int i=0; i<10; i++) {
            if (i<=3) {
                System.out.println("These numbers are smaller than 3");
            } else {
                System.out.println("These numbers are greater than 3");
            }
        }

        //else if statement
        int score = 68;

        if (score < 40) {
            System.out.println("Your grade is F");
        } else if (score >= 40 && score <= 50) {
            System.out.println("Your grade is E");
        } else if (score > 50 && score <= 65) {
            System.out.println("Your grade is D");
        } else if (score > 65 && score <= 70 ) {
            System.out.println("Your grade is C");
        } else if (score > 70 && score <=79) {
            System.out.println("Your grade is B");
        } else if (score > 79 && score <= 100) {
            System.out.println("Your grade is A");
        } else {
            System.out.println("Invalid Score Entered");
        }

        //switch

        char input = '-';
        int a = 10;
        int b = 20;
        int total;

        switch(input) {
            case '+':
                total = a + b;
                System.out.println("The total of A + B is" + " " + total);
                break;

            case '-':
                total = a - b;
                System.out.println("The substraction of A - B is" + " " + total);
                break;

            case '*':
                total = a * b;
                System.out.println("The multiplication of A * B is" + " " + total);
                break;

            case '/':
                total = a / b;
                System.out.println("The division of A / B is" + " " + total);
                break;

            default:
                System.out.println("The input is invalid");
                break;
        }
    }
}
