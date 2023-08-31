package Array_Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise_02_way2 {

	static ArrayList<Integer> numbers = new ArrayList<>();
	static Scanner input = new Scanner(System.in);
	static int menu;
	public static void main(String[] args) {	
		getMenu();
	}
	public static void getMenu() {
		System.out.println("Menu : ");
		System.out.println("Press 1 to Add Element");
		System.out.println("Press 2 to Remove Element");
		System.out.println("Press 3 to Display Elements");
		System.out.println("Press 4 to Exit");
		System.out.println();
		System.out.print("Enter your Choice : ");
//		System.out.println();
		//Scanner input = new Scanner(System.in);
		menu = input.nextInt();
		switch(menu) {
		case 1 : getAdd(); break;
		case 2 : getRemove(); break;
		case 3 : getDisplay(); break;	
		case 4 : exit();
		}		
	}
	private static void exit() {
		System.out.println("Selected EXIT Option :-");
		System.out.println("Bye");
		
	}
	private static void getDisplay() {
		System.out.println("Selcted Display Elements Option :-");
		System.out.println("Your List " + numbers);
		System.out.println();
		getMenu();
	}
	private static void getRemove() {
		System.out.println("Selcted Remove Elements Option :-");
		System.out.print("Enter number to remove from List: ");
		int remo = input.nextInt();
		if(numbers.contains(remo)) 
			numbers.remove(new Integer(remo));
		else
			System.out.println("NOT FOUND");
		System.out.println();
		getMenu();
		
	}
	private static void getAdd() {
		System.out.println("Selcted Add Elements Option :-");
		System.out.print("Enter number for List: ");
		numbers.add(input.nextInt());
		System.out.println("Element Added");
		System.out.println();
		getMenu();
		
	}
}
