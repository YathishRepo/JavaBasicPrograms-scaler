import java.util.Scanner;

public class ScannerClassPractice {

	public static void main(String[] args) {
		
		
//		Scanner input = new Scanner(System.in);
		
		
//		//reading string input from user and printing
//		System.out.print("Enter your name: ");
//		System.out.println("Your name is: " + input.next());		
//	
//		// reading integer from user
//		System.out.print("Enter your age: ");
//		System.out.println("Your age is: " + input.nextInt());
//		
//		// reading String with spaces from user and printing full string
//		System.out.print("Enter your pet name: ");
//		System.out.println("Your pet name is: " + input.nextLine());
//		
//		// reading float from user
//		System.out.print("Enter your exact age: ");
//		System.out.println("Your exact age is: " + input.nextFloat());
//		
//		//Reading data from user and storing it in a variable
//		System.out.println("Enter your phone number: ");
//		long phNumber = input.nextLong();
//		System.out.println("Your Phone number is : " + phNumber);
		
		
//		//EXERCISE - Reading a Favorite number of user from User and displaying it
//		Scanner favNumber = new Scanner(System.in);
//		System.out.print("Enter your Favorite number: ");
//		int number = favNumber.nextInt();
//		System.out.print("Enter your Favorite number with decimal: ");
//		float fNumber = favNumber.nextFloat();
//		System.out.println("your Favorite number is: " + number);
//		System.out.println("your Favorite Decimal number is: " + fNumber);
		
		
		//EXERCISE - Reading Name and Age of user from USER and displaying it
		
		System.out.println("Enter your Name and Age");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		int age = input.nextInt();
		System.out.println("Hi " + name + "!" + " You are "+age+ " years old");
		
		
		

	}

}
