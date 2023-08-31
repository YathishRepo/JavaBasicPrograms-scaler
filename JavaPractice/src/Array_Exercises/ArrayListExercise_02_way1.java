package Array_Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise_02_way1 {

	/* Create a Menu Program with the following options
	 * 1. Add Element
	 * 2. Remove Element
	 * 3. Display Elements
	 * 4. Exit
	 * 
	 * This program runs infinitely until the user chooses then fourth option.
	 * */
	
	static int menu = 0;
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		getMenu();
	
		
	while(true) {
			if(menu == 1) {
			System.out.println("Selcted Add Elements Option :-");
			System.out.print("Enter number for List: ");
			numbers.add(input.nextInt());
			System.out.println("Element Added");
			getMenu();
		}
		
		
			if(menu == 2) {
			System.out.println("Selcted Remove Elements Option :-");
			System.out.print("Enter number to remove from List: ");
			int remo = input.nextInt();
			if(numbers.contains(remo)) 
				numbers.remove(new Integer(remo));
			else
				System.out.println("NOT FOUND");
			getMenu();
		}
		
			if(menu == 3) {
			System.out.println("Selcted Display Elements Option :-");
			System.out.println(numbers);
			getMenu();
		}
		
		if(menu==4) {
			System.out.println("Selected EXIT Option :-");
			System.out.println("Bye");
			break;
		}
	}
	}

	public static void getMenu() {
		System.out.println("Menu : ");
		System.out.println();
		System.out.println("Press 1 to Add Element");
		System.out.println("Press 2 to Remove Element");
		System.out.println("Press 3 to Display Elements");
		System.out.println("Press 4 to Exit");
		System.out.println();
		System.out.print("Enter your Choice : ");
//		System.out.println();
		Scanner input = new Scanner(System.in);
		 menu = input.nextInt();
		
	}

}
