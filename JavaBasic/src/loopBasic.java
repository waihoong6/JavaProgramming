public class loopBasic {
    public static void main (String[] args) {
        /*
        This shall includes basic examples for 'for loop', 'while loop', as well as 'do..while loop'
        and 'for while loop'
        */

        //for loop examples
        /* 
        For loop will start with the number of 0, and it will smaller and equal to 10 as the number increment
        everytime i gets incremented, it will perform the action sysout("Hello World");

        The following example will print "Hello World" 10 times, as it starts with 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        */
        for (int i = 0; i<=10; i++) {
            System.out.println("Hello World");
        }

        //while loop
        /* 
        The following example of while loop. i starts with 0, and as long as i is smaller and equal to 10. 
        it will perform the actions written within the curly bracket which is print the statement in this case,
        and at the same increment i with i++.

        the loop will stop until the point when it loop until i has become 10. Therefore, the statement will be
        printed out 10 times starting with i=0;
        */

        int i = 0;
        while (i <= 10) {
            System.out.println("Hello World under While Loop");
            i++;
        }

        //do while loop
        /* 
        do while loop work very similar as "While loop", however with just an additional 'do' before
        while condition is specify
        */
        
        int j = 0;
        do {
            System.out.println("Hello World under do..while loop");
            j++;
        } 
        while (j <= 5);
    }
}
