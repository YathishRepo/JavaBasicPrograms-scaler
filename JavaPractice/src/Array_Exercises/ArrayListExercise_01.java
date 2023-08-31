package Array_Exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExercise_01 {

	//Progarm to create a list of unique elements taken from the user. Sort and print these elements.
	public static void main(String[] args) {
		ArrayList<Integer> integers = new ArrayList<>();
		System.out.println("Enter 5 elements");
		Scanner in =new Scanner(System.in);
		for(int i=0; i<5; i++) {
			int temp = in.nextInt();
			if(!integers.contains(temp))
				integers.add(temp);
				
		}
		Collections.sort(integers);
		System.out.println(integers);
	}

}
