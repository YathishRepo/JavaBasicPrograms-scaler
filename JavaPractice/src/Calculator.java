import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("Enter num1 Operator Num2 (Example 2 + 3): ");
		Scanner s = new Scanner(System.in);
		double num1 = s.nextInt();
		String operator = s.next(); //to read char from user --> char op = s.next().charAt(0);
		double num2 =s.nextInt();
//		System.out.println(num1);
//		System.out.println(operator);
//		System.out.println(num2);
		if(operator.equals("+"))
			System.out.println("The Result is : "+(int)(num1 + num2) );
		else if(operator.equals("-"))
			System.out.println("The Result is : "+(int)(num1 - num2) );
		else if(operator.equals("*"))
			System.out.println("The Result is : "+(int)(num1 * num2) );
		else if(operator.equals("/"))
			System.out.println("The Result is : "+(num1 / num2) );
		else 
			System.out.println("Invalid Operator");

	}

}
