package Loops_Exercises;
import java.util.Scanner;

public class LoopsExercise_06_Max_Min_Number {

	/**
	 * Read a sequence of numbers from user and stops when user enters negative number and the display Max and Min number of that sequence
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a postive number: ");
		int n=s.nextInt();
		int max = n; 
		int min = n;
		while(n>0){				// here we can use boolean true to enter inside loop
			System.out.println("Enter a postive number: ");
			n=s.nextInt();
			
			if(n<0)
				break;
			
			if(n>max)
				max=n;
			
			if(n<min)
				min=n;

		}
		System.out.println("Done");
		System.out.println("Maximum = " +max + " Minimum = "+min);
		
		
		
		//2nd Method: Using boolean true and if else conditions
		if(n>=0) {
			while(true){				
				System.out.println("Enter a postive number: ");
				n=s.nextInt();
				
				if(n<0)
					break;
				
				max = n>max ? n : max;
				min = n<min ? n : min;
	
			}
			System.out.println("Maximum = " +max + " Minimum = "+min);
		}else
			System.out.println(n+" is a invalid number");
	}

}
