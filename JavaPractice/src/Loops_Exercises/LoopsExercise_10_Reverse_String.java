package Loops_Exercises;

public class LoopsExercise_10_Reverse_String {

	public static void main(String[] args) {
		// Reverse a Given String
		
//		String str = "Ya thi sh    Te j u";
//		for(int i=str.length()-1; i>=0; i--) {
//			System.out.print(str.charAt(i));
//		}
		
		String abc = "Sri Mahadeshwara   Krupe";
		String reverse = "";
		for(int i=abc.length()-1; i>=0;i--) {
			reverse += abc.charAt(i);
		}
		System.out.println(reverse);
	}

}
