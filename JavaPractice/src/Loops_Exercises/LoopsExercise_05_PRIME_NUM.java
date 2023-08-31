package Loops_Exercises;
import java.util.Scanner;

public class LoopsExercise_05_PRIME_NUM {

	/**
	 * 1st Method:
	 * Using count variable and equating to 1 -> if true print prime number
	 * 
	 * 2nd Method:
	 * Using strict divisors of a number i.e sum of divisors == 1 
	 * example: sum of strict divisors of 10 is 8
	 * 			8 != 1-> hence its not prime number
	 * 			sum of strict divisors of 7 is 1 / sum of strict divisors of 11 is 1 / sum of strict divisors of 17 is 1 
	 * 			7 == 1 / 11 == 1 / 17 == 1 ---> Its a prime number
	 * 
	 * 
	 * 3rd Method:
	 * Iterating with all possible divisors except 1 and N(i.e given number)
	 * if i is a divisor of N ----- its not prime number
	 * N is a prime if no divisors is found in the iteration
	 */
	public static void main(String[] args) {
		// Reading a positive number N from the user and displaying Prime or not

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Positive Number ");
		int n = s.nextInt();
		//		int count =0;
		//		if(n==1)
		//			System.out.println(n +" is a PRIME NUMBER");
		//		else {
		//			for(int i=2; i<=n;i++) {
		//				if(n%i==0)
		//					count++;
		//			}
		//			if(count==1)
		//				System.out.println(n+" is a Prime NUmber");
		//			else
		//				System.out.println(n+" is NOT a Prime Number");
		//
		//		}



		//2nd Method:
		//		int j=1, sum=0;
		//		if(n==1)
		//			System.out.println("Prime Number");
		//		else {
		//			while(j<=n/2) {
		//				if(n%j==0)
		//					sum+=j;
		//				j++;
		//			}
		//			System.out.println(sum == 1 ? "Prime NUmber" : "Not a Prime Number");
		//		}
		//		

		// 3rd Method:
		boolean isPrime = true;
		for(int k=2; k<n;k++) {    // here dividing N with all integers >1 and <N(i.e except 1 & N)
			if(n%k==0) {
				//System.out.println("not a prime number");
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime ? "Prime" : "Not Prime");






	}

}
