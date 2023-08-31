package Loops_Exercises;
import java.util.Scanner;

public class LoopsExercise_07_SumOfDigits_OfInteger {

	/**
	 * Display the sum of digits of an Integer read from the user
	 * ex: 417 ==> 4+1+7 = 12
	 * 		511 ==> 5+1+1 = 7
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Integer: ");
		long n = s.nextLong();
		int sum =0;


		

		long rem; 
		for(int i=1 ; i<=10;i++) { 
			rem = n%10; sum+=rem; n = n/10; 
		}
		System.out.println(sum);
		 
		 



		//using WHILE LOOP


//		while(n>0) { 
//			sum += n%10; //abc 
//			n/=10; //ab 
//		} 
//		System.out.println(sum);
	}

}


