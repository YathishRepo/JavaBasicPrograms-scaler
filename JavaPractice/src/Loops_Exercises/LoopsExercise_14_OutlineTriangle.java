package Loops_Exercises;
import java.util.Scanner;

public class LoopsExercise_14_OutlineTriangle {
	/**
	 * Reads a +ve integer N from user and display like following:
	 * Example : N = 5      N=3
	 *     *                  *
	 *    * *                * *
	 *   *   *              *****
	 *  *     *
	 * *********   1 line = 1 star, 2l=3s, 3l=5s, 4l=7s etc
	 * formula is (2*i-1)stars i.e id i =5 -->2*5-1 = 9stars
	 * same formula but using if conditions
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		for(int i=1; i<=n1;i++){ 
			for(int j=1;j<=n1-i;j++) 
				System.out.print(" ");
			for(int k=1; k<=(2*i-1) ;k++) {
				if(i==n1) {				// this if conditions is placed here only..Very Important(if not - o/p will change)								
					System.out.print("*");
					//continue;   
				}else 
					if(k==1||k==2*i-1)
						System.out.print("*");
					else
						System.out.print(" ");

			}
			System.out.println();
		}

	}

}
