package Array_Exercises;
import java.util.Arrays;

public class ArrayExercise_05 {

	//Java Program to display the MAX and MIN Number of an Array element
	public static void main(String[] args) {
		int[] nums = {12, 555, 41, 68596, -22,-8};
		Arrays.sort(nums);
		System.out.println("MIN is = "+ nums[0] + " & MAX is = "+ nums[nums.length-1]);
		
		//2nd Way for finding MAX and MIN elements//
		
		int MAX = nums[0];
		int MIN = nums[0];
		for(int i=1;i<nums.length;i++) {
			MAX = (nums[i]>MAX)?nums[i] : MAX;
			MIN = (nums[i]<MIN)?nums[i] : MIN;
		}
		System.out.println("MAX is = "+MAX + " MIN is = "+MIN);
	}

}
