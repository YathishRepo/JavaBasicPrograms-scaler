package Loops_Exercises;
import java.util.Scanner;

public class LoopsExercise_19_Armstrong_Number {

	/**
	 * Armstrong Number: Armstrong numbers between 0 to 999 are 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407
		ex:- 153: 13 + 53 + 33 = 1 + 125+ 27 = 153
		125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number) 
		1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643
		
		Note that there is no two-digit Armstrong number.
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int res = 0,rem;
		int count=0;
		int temp =n;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		System.out.println(count +" digits are there in given number");
		temp =n;
		while(temp>0) {
			rem=temp%10;
			res+= Math.pow(rem, count);
			temp/=10;
		}
		
		if(n==res)
			System.out.println(n+" is Armstrong Number");
		else
			System.out.println("NOT Armstrong number");
	

	}

}
