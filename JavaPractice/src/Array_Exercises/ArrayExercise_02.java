package Array_Exercises;
import java.util.Scanner;

import org.openqa.selenium.Point;

public class ArrayExercise_02 {
	
	//Java program that fills an array with array of Points object entered by the user (Array size btw 1 to 20)

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for array size [Max of 20] : ");
		int n=s.nextInt();
		while(n<1 || n>20) {
			System.out.println("Entered wrong number, Plz enter number between 1 to 20");
			n = s.nextInt();
		}
		Point[] points = new Point[n];
		fillArrayElements(points);
		printArray(points);

}
		
	public static void fillArrayElements(Point[] points) {
		Scanner input = new Scanner(System.in);
//		int x , y =0;
		for(int i=0; i<points.length;i++) {
			System.out.println("Enter x & y value for point "+ (i+1));
			points[i] = new Point(input.nextInt(),input.nextInt());
		}
	}
	public static void printArray(Point[] points) {
		System.out.println("Here are the elements: ");
		for(int i=0; i<points.length;i++) {
			System.out.print(points[i]+", ");
		}
	}
	

}
