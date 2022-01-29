public class classAndObjects {
    public static void main(String[] args) {
        //in order to make changes to variables that are from another class, we need to create an OBJECT
        //as a reference to the variables in THAT CLASS

        //to create an OBJECT, it will be using the same name as the class, as below:
        thisIsAClass referenceOfObject = new thisIsAClass();
        referenceOfObject.a=10;
        System.out.println("Initiating the value of a:" + " " + referenceOfObject.a);

        //to access or modify value of variable b and c as below:

        referenceOfObject.setValB(100); //set value for b by method call

        //call the value that we have set for b by method calling as well as below:
        System.out.println("Getting Value that we set for b by calling getter method:"
                            + " " + referenceOfObject.getValB());

        //same goes to variable c
        referenceOfObject.setValC("Assigning Values to C");

        System.out.println("Getting Value that we set for c by calling getter method:"
                            + " " + referenceOfObject.getValC());
    }
}

class thisIsAClass {
    //int a is automatically declared as public if you did not defined its type explicitly
    //you can then proceed to assign the value of a as above (in Main method)
    int a;

    //in the case of private variable, you cannot access/modify on this variable directly
    //you will need a GETTER and SETTER method to access this variable
    private int b;
    private String c;

    //getter methods for variable b and c
    public int getValB () {
        return b;
    }

    public String getValC () {
        return c;
    }

    //setter methods for variable b and c
    public void setValB (int b) {
        this.b = b;
    }

    public void setValC (String c) {
        this.c = c;
    }
}
