import java.util.Scanner;

public class HelloWorld {
	public static void main (String[] args) {
//		System.out.println("Hello World");
//		
//		System.out.println(Math.max(1, 19));
//		System.out.println(Math.random()*100);
//		
//		System.out.println(Math.sqrt(100));
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a word:");
//		String abc = sc.nextLine();
//		System.out.println("Enter a number:");
//		int a = sc.nextInt();
//		System.out.println("Enter a double integer:");
//		double c = sc.nextDouble();
//		
//		System.out.println("You have entered:" + " " + abc + " " + a + " " + c);
		
//		int n = 12345;
//		
//		int firstnum = (n/10000);
//		n = n%10000;
//		System.out.println(n);
//		int secondnum = (n/1000);
//		System.out.println(secondnum);
//		
		//System.out.println(n);
		
//		for(int i=0; i<=10; i++) {
//			System.out.println("This is i:" + " " + i);
//			for (int k = 1; k<5; k++) {
//				System.out.println(k);
//			}
//		}
		
		for (int i=0; i<5; i++)
		{
			for (int k=0; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}