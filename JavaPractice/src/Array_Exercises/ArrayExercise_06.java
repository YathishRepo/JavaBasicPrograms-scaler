package Array_Exercises;
import java.util.Arrays;

public class ArrayExercise_06 {

	//Java Program to places the ODD elements of an array before the EVEN elements
	
	public static void main(String[] args) {
		int[] nums = {1,3,4,5,7,9,6,-2,44,22,5,66,103};
		System.out.println(Arrays.toString(nums));
		int[] temp = new int[nums.length];
		int j=0;
		int k=temp.length-1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2 != 0)
				temp[j++] = nums[i];   // post increment means uses original value 1st and after executing the statement value gets incremented.
			else
				temp[k--] = nums[i];   // Same logic here too
		}
		
		System.out.println(Arrays.toString(temp));	
		
		
	}

}
