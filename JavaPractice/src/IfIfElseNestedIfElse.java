import java.util.Scanner;

public class IfIfElseNestedIfElse {

	public static void main(String[] args) {


		System.out.print("Enter the Numer: ");
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
//Reading input as a number from User and find the number is ODD or EVEN
		
		
//		// using only IF condition
//		if(num%2 == 0)
//			System.out.println(num + " is a EVEN number");
//		if(num%2 == 1)
//			System.out.println(num + " is a ODD number");
		
		

//		// using IF_ELSE condition
//		if(num%2 == 0)
//			System.out.println(num + " is a even number");
//		else
//			System.out.println(num + " is a odd number");
		
//// Reading a number from user and display >10, if number greater than 10 using NESTED IF_ELSE Statements
//		if(num > 10)
//			System.out.println("Entered number is greater than 10");
//		else if(num == 10)
//			System.out.println("Enteted number is equal to 10");
//		else
//			System.out.println("Entered number is less than 10");
		
		
//		// SWITCH Statement [Break keyword is not added, so followed cases get executed
//		switch (num) {
//		case 10 : System.out.println("= 10");
//		case 20 : System.out.println("= 20");
//		case 30 : System.out.println("= 30");
//		default : System.out.println("none of the above");
//		}
		

		// ODD or EVEN number using SWITCH statement
		
		switch(num%2) {
		case 0 : 
			System.out.println("EVEN NUMBER");
			break;
		case 1 :
			System.out.println("ODD NUMBER");
			break;
			
		}
		
		
		
		
	}

}
