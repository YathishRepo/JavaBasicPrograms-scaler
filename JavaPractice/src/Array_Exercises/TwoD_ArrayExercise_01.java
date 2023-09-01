package Array_Exercises;

public class TwoD_ArrayExercise_01 {

	//Java Program that prints the sum of each row in 2D array
	public static void main(String[] args) {
		int[][] numbers = {{4,17,5,11},{4,5,5,5},{4,1,5,17}};
		printRowSum(numbers);
		printColumnSum(numbers);
	}

	private static void printColumnSum(int[][] numbers) {
		int sum=0;
		for(int i=0; i<4;i++) {
			for(int j=0; j<3;j++)
				sum+=numbers[j][i];
		System.out.println("The SUM of Column "+(i+1)+ " is: "+ sum);
		sum=0;
		
		}
		
	}

	public static void printRowSum(int[][] numbers) {
		int sum=0;
		for(int i=0; i<numbers.length;i++) {
			for(int j=0; j<numbers[i].length;j++)
				sum+=numbers[i][j];
		System.out.println("The SUM of row "+(i+1)+ " is: "+ sum);
		sum=0;
		}
		
	}

}
