import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
//		System.out.println("Enter thye range to find prime numbers");
//		Scanner input = new Scanner(System.in);
//		int m = input.nextInt();
//		int n = input.nextInt();
//		primeNum(1, 100);
		
		int a=12;
		for(int i =2; i<=a/2;i++) {
			if(a%i==0) {
				System.out.println(a + " is NOT a prime number");
				break;
			}
			
		}
		System.out.println(a + " is a prime number");
//		break;
	}
}
	
//	public static void primeNum(int x, int y) {
//		int count = 0;
//		while(x<=y) {
//			for(int i=2; i<=y;i++) {
//				if(x%i==0)
//					count++;
//			}
//			if(count==1 || x==1)
//				System.out.print(x+" ");
//			x++;
//			count = 0;
//			}
//		}
//	}
