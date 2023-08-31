package Loops_Exercises;

public class LoopsExercise_01_Multiplication_Table {

	public static void main(String[] args) {
//Multiplication Table upto 10.
		
		/*1 2 3 4 5 6 7 8 9 10
		2 4 6 8 10 12 14 16 18 20
		.
		.
		10 20 30 40 50 60 70 80 90 100*/
		
		for(int i = 1; i<=10; i++) {   // this loop responsible for the Row
			for(int j = 1; j<=10; j++)   //this loop is responsible for the Value or column
				System.out.print(i*j + " ");
			System.out.println();
		}

	}

}
