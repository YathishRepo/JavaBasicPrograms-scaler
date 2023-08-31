import java.util.Scanner;

public class LuckyNumberProgram {

	public static void main(String[] args) {
//4 digit number ABCD --> A+B = C+D --> Lucky number or else NOT lucky number
		
		System.out.print("Enter a four digit number: ");
		
		Scanner s = new Scanner(System.in);
		
		String num = s.next();
		if(num.length()==4) {
			int ab = num.charAt(0)+num.charAt(1);
			int cd = num.charAt(2)+num.charAt(3);
				if(ab == cd)
					System.out.println("Given Number is Luckkkyy Number");
				else
					System.out.println("NOT LUCKY NUMBER");
		}
		else
			System.out.println("Invalid Number!, Enter only 4 digit number");

		
// Logic Using Modules (%) and division (/)
		/*	ABCD = 1234 -->
			 1234 % 10 = 4
			(1234 / 10) = 123 % 10 ==> 3
			(1234 / 100) = 12 % 10 ==> 2
			(1234 / 1000) = 1 % 10 ==> 1  */
		int num1 = s.nextInt();
		int fourthNum = num1 % 10; //D
		int thirdNum = (num1/10)%10; //C
		int secondNum = (num1/100)%10; //B
		int firstNum = (num1/1000)%10; //A
		
		if((firstNum+secondNum) == (thirdNum+fourthNum))
			System.out.println("Lucky Number");
		else
			System.out.println("NOT Lucky Number");
		
		
		
	}

}
