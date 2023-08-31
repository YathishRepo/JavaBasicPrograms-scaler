package Loops_Exercises;

public class LoopsExercise_11_Palindrome {

	/**
	 * Palindrome : abba, noon, 123321, appa, amma etc -- are palindrome
	 * 				: yathi, smk, Gowda, 1234 etc ---- are NOT palindrome
	 */
	
	public static void main(String[] args) {
		// Checking the given String is Palindrome or not
		
		String str = "123321";
		String rev = "";
		for(int i=str.length()-1; i>=0;i--) {
			rev+=str.charAt(i);
		}
//		System.out.println(rev);
		if(str.equals(rev))
			System.out.println("Given String is a Palindrome String");
		else
			System.out.println("String is NOT a Palindrome");
		
		
		// 2nd Method: using 2 variable i and j
		
		String s = "ymggm8y";
		System.out.println(s.length());
		boolean isPalindrome = true;
		for(int i=0, j=s.length()-1; i<j; i++,j--) {           
			if(s.charAt(i)==s.charAt(j))
				continue;
			
			isPalindrome = false;
			break;
		}
		System.out.println(isPalindrome?"Palindrome":"Not Palindrome");

	}

}
