
public class CallingStringMethods {

	public static void main(String[] args) {
		 String s1 = "My name IS a yAThish gOWDa";
		
		//to upper case & lower case text
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//length of string
		System.out.println(s1.length());
		String s2 = " ab";
		System.out.println(s2.length()); //space is also counting
		
		//indexOf and lastIndexOf()
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.indexOf("IS")); // it gives the word 1st letter index
		
		//isEMpty(), isblank()
		String s3 = " ";
		System.out.println(s1.isEmpty());
		System.out.println(s3.isEmpty());// its count space also
		System.out.println(s3.isBlank()); //its only check for characters inside, neglects space

		//charAt()
		System.out.println(s1.charAt(4));
		
		//concate()
		String s4 = "YMG";
		System.out.println(s4.concat("Teju"));
		
	}

}
