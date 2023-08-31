import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] A = {"abcd","aze"};
				Arrays.sort(A);
		
		String res ="";
//		   String s1 = strs[0];
//         String s2 = strs[strs.length-1];
//         int id =0;
//         while(id < s1.length() && id < s2.length()){
//             if(s1.charAt(id) == s2.charAt(id))
//             id++;
//             else
//             break;
//         }
//         System.out.println(s1.substring(0,id));
//      int k=0;
      System.out.println(Arrays.deepToString(A));
      for(int k=0; k<A[0].length() && k<A[A.length-1].length();k++) {
		if(A[0].charAt(k)==A[A.length-1].charAt(k))
			res+=A[0].charAt(k);
      }
        System.out.println(res);
        System.out.println();

	}

}
