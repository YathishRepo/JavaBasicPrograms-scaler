package Loops_Exercises;
import java.util.Scanner;

public class LoopsExercise_12_Pattern_Rightangle {

	/**
	 * Reads a +ve integer N from user and display like following:
	 * 1
	 * 22
	 * 333
	 * .....
	 * ....
	 * NNNNNNNN...NNNN
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int n = s.nextInt();
		for(int i=1; i<=n;i++) {          // Outer loop is responsible for the number of lines
			for(int j=0; j<i;j++) {		// Inner loop is responsible for the what needs to print and How many time in each line
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
