package c10_1D_Array;
import java.util.*;

public class ClassPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q1 :  Take an array of size n and print it
					//		Scanner scn=new Scanner(System.in);
					//		int n = scn.nextInt();
					//		int[] arr = new int[n];
					//		for(int i=0; i<=arr.length-1;i++) {
					//			arr[i]=scn.nextInt();			
					//		}
					//		for(int i=0; i<=arr.length-1;i++) {
					//				System.out.print(arr[i]+" ");
					//		}
		
		//Q2 : Take an array of size n as integer and print the sum of an array
					//				Scanner scn=new Scanner(System.in);
					//				int n = scn.nextInt();
					//				int sum=0;
					//				int[] arr = new int[n];
					//				for(int i=0; i<=arr.length-1;i++) {
					//					arr[i]=scn.nextInt();			
					//				}
					//				for(int i=0; i<=arr.length-1;i++) {
					//						sum+=arr[i];		
					//				}
					//				System.out.print(sum);
		
		//Q3 :  You have to take n numbers from the user and print the max number.
					//				Scanner scn=new Scanner(System.in);
					//				int n = scn.nextInt();
					//				
					//				int[] arr = new int[n];
					//				for(int i=0; i<=arr.length-1;i++) {
					//					arr[i]=scn.nextInt();			
					//				}
					//				int max=arr[0];
					//				for(int i=1; i<=arr.length-1;i++) {
					//					if(arr[i]>max)
					//						max=arr[i];
					//				}
					//				System.out.println(max);
		
		//Q4 : You have to take n numbers from the user and print the min number.
					//				Scanner scn=new Scanner(System.in);
					//				int n = scn.nextInt();
					//						
					//				int[] arr = new int[n];
					//				for(int i=0; i<=arr.length-1;i++) {
					//					arr[i]=scn.nextInt();			
					//				}
					//				int min=arr[0];
					//				for(int i=1; i<=arr.length-1;i++) {
					//					if(arr[i]<min)
					//						min=arr[i];
					//				}
					//				System.out.println("Minimum Number is "+ min);
						
		//Q5 : Given an integer array as input, check weather K is present in the array or not(Use Functions / Methods structure)
					//			Scanner scn=new Scanner(System.in);
					//			int n = scn.nextInt();		
					//			int[] arr = new int[n];
					//			for(int i=0; i<=arr.length-1;i++) {
					//				arr[i]=scn.nextInt();			
					//			}
					//			if(findK(arr)==true)
					//				System.out.println("The given element is present");
					//			else
					//				System.out.println("The given element is NOT present");

		//Q6 : Given an integer array as input, return the frequency(occurrence) of k in the array(Use Functions / Methods structure)
					//				Scanner scn=new Scanner(System.in);
					//				int n = scn.nextInt();		
					//				int[] arr = new int[n];
					//	 			for(int i=0; i<=arr.length-1;i++) {
					//					arr[i]=scn.nextInt();			
					//				}
					//				System.out.println("the freqency of element K is "+FreqOfK(arr));
		
							
		//Q7 : Given an array as integer, return the frequency count of an array
		/*
		 * eg : arr = [1,1,2,1,3,1,3] 
		 * output = [4,4,1,4,2,4,2] - freq count of each element
		 */
							int[] arr = {1,1,2,1,3,1,3};
							
							
							
							
							
							
							
							
							
							
							
	}

	public static int FreqOfK(int[] arr) {
		int count=0;
		int k=new Scanner(System.in).nextInt();
		for(int i=0;i<arr.length;i++) {
			if(k==arr[i])
				count++;
		}		
		return count;
	}

	//Q5 : 
	public static boolean findK(int[] arr) {
		// TODO Auto-generated method stub
		int k=new Scanner(System.in).nextInt();
		for(int i=0;i<=arr.length-1;i++) {
			if(k==arr[i])
				return true;
		}
		return false;
	}

}
