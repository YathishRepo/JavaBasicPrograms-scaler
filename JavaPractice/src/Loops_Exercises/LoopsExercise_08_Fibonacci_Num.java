package Loops_Exercises;
import java.util.Scanner;

public class LoopsExercise_08_Fibonacci_Num {

	/**
	 * FIBONACCI SERIES ==> 1,1,2,3,5,8,13,21,......
	 * Reads a integer N from user and display the nth Fibonacci number...
	 * ex: if n is 3 = display 3
	 *     if n is 6 = display 8
	 *     :-> To get 6th fibonacci number --- need 2 steps
	 *     
	 *     		i.e to get nth fibonacci number --- need (n - 2) steps
	 */
	public static void main(String[] args) {
		//To print Series of FIBONNACI numbers....
		//		int n1 = 1, n2 = 1;
		//		int n3;
		//		System.out.print(n1+" "+n2);
		//		for(int i = 1; i<=10; i++) {
		//			n3 = n1+n2;
		//			System.out.print(" "+n3);
		//			n1=n2;
		//			n2=n3;
		//		}


		//To print nth of fibonnaci number:

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the positive integer n: ");
		int n=s.nextInt();

		int a = 1; int b = 1;
		int c = 0;
//		if(n==1 || n==2)
//			System.out.println(n+"th Fibonacci number is: "+ 1);
//		else {
			for(int j=0; j<n-2; j++) {
				c=a+b;
				a=b;
				b=c;
			}
//			System.out.println(n+"th Fibonacci number is: "+ c);
			System.out.println(n+"th Fibonacci number is: "+ (c == 0 ? 1 : c));  // this will work when If condition is not there
//		}

	}

}
