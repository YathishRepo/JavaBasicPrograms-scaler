package Loops_Exercises;

public class LoopsExercise_09_PrintString_WithSpace {

	public static void main(String[] args) {
		// Displaying a string with a space after each character
		
		String str = "Yat hish  Teju";
		for(int i=0; i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}

	}

}
