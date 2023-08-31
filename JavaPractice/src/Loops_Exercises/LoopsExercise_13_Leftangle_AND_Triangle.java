package Loops_Exercises;
import java.util.Scanner;

public class LoopsExercise_13_Leftangle_AND_Triangle {
	/**
	 * Reads a +ve integer N from user and display like following:
	 * Example : N = 5      N=3
	 *     *                  *
	 *    **                 **
	 *   ***                ***
	 *  ****
	 * *****
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1; i<=n;i++){      // Outer loop for number of lines
			for(int j=1;j<=n-i;j++)   // this is for printing spaces
				System.out.print(" ");  //Next loop is to print stars
			for(int j=1; j<=i ;j++)          //here both loops are different & on same level, once this loop started, old j variable 
				System.out.print("*");		//-loop got destroyed. hence we can use same variable J in this loop also, after this also variable j will get destroyed

			System.out.println();
		}

		/**
		 * Reads a +ve integer N from user and display like following:
		 * Example : N = 5      N=3
		 *     *                  *
		 *    ***                ***
		 *   *****              *****
		 *  *******
		 * *********   1 line = 1 star, 2l=3s, 3l=5s, 4l=7s etc
		 * formula is (2*i-1)stars i.e id i =5 -->2*5-1 = 9stars
		 */

		int n1 = s.nextInt();
		for(int i=1; i<=n1;i++){ 
			for(int j=1;j<=n1-i;j++) 
				System.out.print(" ");
			for(int k=1; k<=(2*i-1) ;k++) 
				System.out.print("*");
			System.out.println();
		}

	}
}
