package Loops_Exercises;

public class LoopsExercise_18_Factorial {

	public static void main(String[] args) {
		// FInding factorial of a number: ex:- 4! == 4*3*2*1 =24
		
		int n = 25;
		int res=1;
		for(int i=n; i>=1;i--) {
			res*=i;
		}
		System.out.println(res);
	}

}
