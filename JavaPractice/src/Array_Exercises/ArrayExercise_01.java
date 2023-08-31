package Array_Exercises;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise_01 {
	
	//Java program that fills an array with N integers entered by the user (Array size btw 1 to 20)

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			System.out.println("Enter the number for array size [Max of 20] : ");
			int n=s.nextInt();
			while(n<1 || n>20) {
				System.out.println("Entered wrong number, Plz enter number between 1 to 20");
				n = s.nextInt();
			}
			int[] numbers = new int[n];
			fillArrayElements(numbers);
			printArray(numbers);
			

	}
	public static void fillArrayElements(int[] n1) {
		Scanner input = new Scanner(System.in);
		for(int i=0; i<n1.length;i++)
			n1[i] = input.nextInt();
		
	}
	
	public static void printArray(int[] numbers) {
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
//		for(int i=0; i<numbers.length;i++)
//		System.out.println(numbers[i]);
		
	}

}
