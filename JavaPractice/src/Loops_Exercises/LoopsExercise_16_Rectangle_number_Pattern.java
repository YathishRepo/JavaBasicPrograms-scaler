package Loops_Exercises;

public class LoopsExercise_16_Rectangle_number_Pattern {
	/**
	 * Reads a +ve integer N from user and display like following:
	 * Example : N = 5     N=3
	 *	5432*					32*
	 *	543*1   				3*1
	 *	54*21 					*21
	 *	5*321
	 *	*4321   
	 */
	public static void main(String[] args) {

		int n1=5;
		for(int i=1; i<=n1; i++) {
			for(int j=5;j>=1;j--) {
				if(j!=i)
					System.out.print(j);
				else
					System.out.print("*");
			}
			System.out.println();

		}
		
		System.out.println();
		
		int n=5;
		for(int i=n; i>=1; i--) {
			for(int j=1;j<=n;j++) {
				if(j!=i)
					System.out.print(j);
				else
					System.out.print("*");
			}
			System.out.println();

		}

	}

}
