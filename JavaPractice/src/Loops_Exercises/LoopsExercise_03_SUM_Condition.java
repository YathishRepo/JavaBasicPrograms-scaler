package Loops_Exercises;
import java.util.Scanner;

public class LoopsExercise_03_SUM_Condition {

	public static void main(String[] args) {
		// Reading sequence of integers from user and displaying DONE when sum of integers exceeds 100
		
		Scanner s = new Scanner(System.in);
		int num1=0, num;
		while(true) {
			System.out.print("Enter a number: ");
			num = s.nextInt();
			num1+=num;
			if(num1>=100) {
				System.out.println("DONE - " +num1+ " (Exceeds sum 100)");
				break;
			}
		}
		
		//Using DO WHILE LOOP
		
		do {
			System.out.print("Enter a number: ");
			num1 += s.nextInt();
		} while(num1<=100);
		System.out.println("DONE - " +num1);
	}

}
