
public class MethodsExercise_2 {

	public static void main(String[] args) {
		printPrimeBtw(1, 30);
	}

/**
 * Written full code in single method:
 */

//	public static void printPrimeBtw(int x, int y) {
//		int count=0;
//		if(x==1)
//			System.out.print(x+" ");
//		for(int i=x; i<=y;i++) {
//			for(int j=2;j<=y;j++) {
//				if(i%j==0)
//					count++;
//			}
//
//			if(count==1)
//				System.out.print(i+" ");
//			count=0;
//
//		}
//
//	}
	
	
	/**
	 * Written code is 2 methods are isPrime() and printPrimeBtw()
	 * isPrime method contains code to check number is prime or not and returns true/false
	 * printPrimeBtw() method prints the prime number based on isPrime returned value.
	 */

	public static boolean isPrime(int n) {
		/**
		 * Using count variable: condition i<=n
		 */
//		int count=0;
//		boolean prime = false;
//		for(int i=2; i<=n;i++) {
//			if(n%i==0)
//				count++;
//		}
//		if(count==1 || n==1)
//			prime = true;
//		return prime;
		
		/**
		 * without count variable: condition i=2; i<=n/2
		 */
		
		for(int i=2; i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
		
	}

	public static void printPrimeBtw(int a, int b) {
		do {
			if(isPrime(a))
				System.out.print(a+" ");
			a++;
		}while(a<=b);
	}
}
