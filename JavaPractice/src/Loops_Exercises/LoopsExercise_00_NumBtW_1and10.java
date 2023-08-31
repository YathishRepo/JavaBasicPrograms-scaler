package Loops_Exercises;
import java.util.Scanner;

public class LoopsExercise_00_NumBtW_1and10 {

	public static void main(String[] args) {
		
// finding number b/w 1 & 10 using WHILE LOOP
		/*System.out.print("Enter a number between 1 & 10: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		while(num<1||num>10) {
			System.out.println(num + " is not between 1 & 10, try again");
			num = s.nextInt();
		}
		
		System.out.println(num + " is between 1 & 10, Thanks!");*/
		
		
		/*--------------------------------------------------------------------------------------------------------------*/
		
		
// finding number b/w 1 & 10 using WHILE LOOP
		
		Scanner n = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter a number between 1 and 10: ");
			number = n.nextInt();
		}while(number<1||number>10);

		System.out.println(number + " is between 1 and 10, Thanks");
	}

}
