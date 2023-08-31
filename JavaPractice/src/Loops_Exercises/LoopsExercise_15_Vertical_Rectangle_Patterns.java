package Loops_Exercises;
import java.util.Scanner;

public class LoopsExercise_15_Vertical_Rectangle_Patterns {
	/**
	 * Reads a +ve integer N from user and display like following:
	 * Example : N = 5      N=3
	 *  *****               ***
	 *  *****               ***
	 *  *****               ***
	 *  *****
	 *  *****   
	 */
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		
//		for(int i=1; i<=n;i++) {
//			for(int j=1; j<=n;j++)
//				System.out.print("*");
//			System.out.println();
//		}
		
		/**
		 * Reads a +ve integer N from user and display like following:
		 * Example : N = 5      N=3
		 *  *****               ***
		 *  *   *               * *
		 *  *   *               ***
		 *  *   *
		 *  *****   
		 */
//		for(int i=1; i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(i==1 ||i==n)
//					System.out.print("*");
//				else if(j==1 || j==n )
//					System.out.print("*");
//				else
//					System.out.print(" ");			
//			}
//			System.out.println();
//		}
		
		/**
		 * Reads a +ve integer N from user and display like following:
		 * Example : N = 5      N=3
		 *  *****               ***
		 *   ***                 *
		 *   ***                ***
		 *   ***
		 *  *****   
		 */
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 ||i==n)
					System.out.print("*");
				else if(j==1 || j==n )
					System.out.print(" ");
				else
					System.out.print("*");			
			}
			System.out.println();
		}
		

	}

}
