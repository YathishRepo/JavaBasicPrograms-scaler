package Array_Exercises;
import java.util.Arrays;

public class ArrayExercise_04 {

		//Java program to display the number of occurrences of an element in the array.
	
	
	public static void main(String[] args) {
		int[] nums = { 1,1,1,2,2,3,5,6,7,7};
		int searchNum = 7;
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(searchNum == nums[i])
				count++;
		}
		System.out.println(searchNum + " occurs " + count + " times");

	}

}
