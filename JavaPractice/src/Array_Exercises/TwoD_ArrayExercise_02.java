package Array_Exercises;

public class TwoD_ArrayExercise_02 {
	
	//Print the Max element in each row of 2d array 

	public static void main(String[] args) {
		int[][] abc = {{1,4,56} , {2,3,4,1}, {3434,3}, {-9,-7,-23,0}};
		int max;
		for(int i=0; i<abc.length;i++) {
			max=0;
			for(int j=0;j<abc[i].length;j++)
				max = (abc[i][j] > max)?abc[i][j] : max;
			System.out.println("The MAX number in "+(i+1)+" row is "+ max);
		}

	}

}
