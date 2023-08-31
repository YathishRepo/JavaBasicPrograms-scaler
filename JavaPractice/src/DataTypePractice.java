

public class DataTypePractice {

	public static void main(String[] args) {
		//Integer Data Types
				 byte b1 = 45;
				short s1 = 417;
				final int i1 = 417511; // its constant Variable, value cannot be changed
				long l1 = 12345678999l;
				
		// FLoating-Point Data Types
				float f1 = 12.2F;
				float f2 = 4; // storing int 4 to float, its convert int 4 to 4.0f
				double d1 = 417.511;
				
				
				
				System.out.println(b1);
				System.out.println(s1 - l1);
				System.out.println(i1 - s1);
				System.out.println(l1 - b1);
				 b1 = 54;
				 System.out.println(b1);
				 System.out.println(l1);
				 
				 // TO FIND RANGE OF DATA TYPES THROUGH JAVA CODE 
				 System.out.println("TO FIND RANGE OF DATA TYPES THROUGH JAVA CODE :- ");
				//Byte
				 System.out.println("BYTE RANGE");
				 System.out.println(Byte.MIN_VALUE);
				 System.out.println(Byte.MAX_VALUE);
				 
				//Short
				 System.out.println("SHORT RANGE");
				 System.out.println(Short.MIN_VALUE);
				 System.out.println(Short.MAX_VALUE);
				 
				//Integer
				 System.out.println("INTEGER RANGE");
				 System.out.println(Integer.MIN_VALUE);
				 System.out.println(Integer.MAX_VALUE);
				 
				//Long
				 System.out.println("LONG RANGE");
				 System.out.println(Long.MIN_VALUE);
				 System.out.println(Long.MAX_VALUE);
				 
				 //Float
				 System.out.println(Float.MIN_VALUE);
				 System.out.println(Float.MAX_VALUE);
			
				//Double
				 System.out.println(Double.MIN_VALUE);
				 System.out.println(Double.MAX_VALUE);
		
	}

}
