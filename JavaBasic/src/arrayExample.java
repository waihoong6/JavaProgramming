import java.util.Arrays;

public class arrayExample {
    public static void main(String[] args) {

        /*
         * both the statement below are to declare an array and both are valid. this
         * also applicable to String[] args or String args[] both are applicable and
         * valid
         */

        /*
         * both the declared arrays below will be holding primitive type variables. User
         * can also declare an array which hold an user-defined data type (Objects of a
         * class)
         */
        int[] a; // declaration of an array
        int b[]; // declaration of an array

        /*
         * In array, each element are stored in an index. Index of array starts from 0.
         * For example, if you declared an array int[] a = new int [10] as shown below
         * meaning that the index will start from 0 and ends at 9
         */
        a = new int[10]; // allocating memory to the array a

        a[0] = 2; // assigning values into array a
        a[1] = 3; // assigning values into array a

        // alternative ways to assign values into an array
        int[] c = { 15, 10, 5, 50, 40, 30, 20 }; // assining values into array c

        // to access to the array element
        /*
         * two ways you can access to elements of an array are through i. For loop ii.
         * For each loop
         */

        /*
         * i. For loop will loop through the element of array through the index as shown
         * below
         */
        for (int i = 0; i < c.length; i++) {
            System.out.println("Using for loop to loop through elements in the array:" + " " + c[i]);
        }

        /*
         * ii. For each loop works exactly the same as for loop but with a little bit
         * different in terms of syntax
         */

        for (int arrComponents : c) {
            System.out.println("Using For each loop to loop through elements in the array" + " " + arrComponents);
        }

        /*
         * you can sort an array by using sort() methods
         */

        Arrays.sort(c);
        for (int arrComponents : c) {
            System.out.println("Sorted array" + " " + arrComponents);
        }

        /* 
        you can also compare if two arrays are same by using the equals() method
        */

        int arr1[] = {1,2,3,4};
        int arr2[] = {1,2,3,4};

        System.out.println(Arrays.equals(arr1, arr2));

        int arr3[] = {1,2,3,4};
        int arr4[] = new int[4];
        arr4[0] = 1;
        arr4[1] = 2;
        arr4[2] = 3;
        arr4[3] = 4;
        System.out.println(Arrays.equals(arr3, arr4));
    }
}