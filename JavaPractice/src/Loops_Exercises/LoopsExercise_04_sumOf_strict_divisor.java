package Loops_Exercises;
import java.util.Scanner;

public class LoopsExercise_04_sumOf_strict_divisor {

	public static void main(String[] args) {
		// Printing the sum of strict divisor of an integer given by the user.
		//		example >> 	6 -> 1 + 2 + 3 == 6
		//					10 -> 1 + 2 + 5 == 8
		//					30 -> 1 + 2 + 3 + 5 + 6 + 10 + 15 == 42
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		int sum=0;
		
		//Using FOR LOOP:
		
		/*
		 * for(int i = 1; i<=num/2; i++) { if(num%i==0) { sum += i; } }
		 * System.out.println(sum);
		 */
		 
		//Using WHILE LOOP:
		
		/*
		 * int i=1; while(i<num) {
		 * 
		 * if(num%i==0) sum+=i; i++; } System.out.println(sum);
		 */
		
		//Using DO WHILE LOOP: Printing Strict divisors and sum of that divisors
		
		int i=1;
		do {
			if(num%i==0) {
				sum+=i;
				System.out.print(i+" ");
			}
			i++;
		}while(i<num);
		System.out.println();
		System.out.println(sum +" is a SUM of Strict Divisor");

	}

}
