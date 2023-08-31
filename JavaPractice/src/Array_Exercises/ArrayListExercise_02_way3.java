package Array_Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise_02_way3 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			displayMenu();
			int choice = input.nextInt();
			if(choice == 1) {
				//ADD
				System.out.print("Enter an Integer: ");
				numbers.add(input.nextInt());
				System.out.println("Element Added");
			}else if(choice == 2) {
				//REMOVE
				System.out.print("Enter number to remove from List: ");
				int remo = input.nextInt();
				if(numbers.contains(remo)) { 
					numbers.remove(Integer.valueOf(remo));
				//OR :- numbers.remove(Integer.valueOf(remo));
					System.out.println("Element Removed.");
				}else
					System.out.println("NOT FOUND");
			}else if(choice == 3) {
				//DISPLAY
				System.out.println("Your List " + numbers);
			}else if(choice ==4) {
				System.out.println("Good Bye");
				break;
			}
		}
	}

	private static void displayMenu() {
		System.out.println("Menu : ");
		System.out.println("Press 1 to Add Element");
		System.out.println("Press 2 to Remove Element");
		System.out.println("Press 3 to Display Elements");
		System.out.println("Press 4 to Exit");
		System.out.println();
		System.out.print("Enter your Choice : ");
	}

}
