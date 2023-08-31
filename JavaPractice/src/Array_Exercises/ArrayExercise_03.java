package Array_Exercises;

public class ArrayExercise_03 {
	//Java program to display the SUM, PRODUCT and AVERAGE of the elements of an integer array
	
	public static void main(String[] args) {
		int[] nums = {1, 2, -3, 5,7};
		calculator(nums);
	}
	public static void calculator(int[] numbers) {
		int sum = 0;
		double avg =0.0;
		int product = 1;
		for(int i=0; i<numbers.length; i++) {
			sum +=numbers[i];
			product*=numbers[i];
		}
		avg = (double)sum/numbers.length;
		
		System.out.println("SUM is = " + sum);
		System.out.println("PRODUCT is = " + product);
		System.out.println("AVERAGE is = " + avg);
	}

}
