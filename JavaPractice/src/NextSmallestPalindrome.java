
public class NextSmallestPalindrome {

	public static void main(String[] args) {
		String A = "74";
		int num=Integer.parseInt(A);
		num++;
		while(num>0) {
		if(palindrom(num)==num) {
			System.out.println("NEXT PALINDROME : " + num);
			 break;
		}
		else
			num++;
		}
		
		////________2nd Logic____________////
		while(palindrom(num)==0) {
			num=num+1;
		}
		System.out.println("Next palindrome : " + num);

}
	public static int palindrom(int num) {
		int n1=num;
		int res=0;
		int temp=0;
		while(num>0) {
			temp=num%10;
			res=(res*10)+temp;
			num=num/10;
		}
		if(n1==res)
			return res;
		return 0;
	
	}
}
