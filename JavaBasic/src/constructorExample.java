public class constructorExample {
    //Constructor is used to initialize variables and it MUST have the same name as the class.
    int a;
    private String b;

    constructorExample(int a, String b) {
        this.a = a;
        this.b = b;

        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        constructorExample objRef = new constructorExample(3, "hello");
    }
}
