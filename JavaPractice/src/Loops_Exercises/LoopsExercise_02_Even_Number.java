package Loops_Exercises;

public class LoopsExercise_02_Even_Number {

	public static void main(String[] args) {
	// Print even numbers from 1 to 100 in increasing order...(2 4 6 8 .....100)
		
		//Using WHILE LOOP:
		int i = 1;
		while(i <=100) {
			if(i%2==0) 
			System.out.print(i+" ");
		i++;
		}
		System.out.println();
		
		//Using FOR LOOP:
		for(int j=1; j<=100; j++) {
			if(j%2==0)
				System.out.print(j+" ");
		}
		System.out.println();
		
		//Using DO WHILE LOOP:
		int m = 1;
		do {
			if(m%2==0)
				System.out.print(m+" ");
			m++;
		}while(m<=100);
		System.out.println();
		
		
/*---------------------------------------------------====================================---------------------------------------*/		
		// Print even numbers from 100 to 1 in decreasing order...(100 98 96 94 ..... 4 2)
		

		//Using FOR LOOP:
		for(int k=100;k>=1;k--) {
			if(k%2==0)
			System.out.print(k+" ");
		}

	}

}
