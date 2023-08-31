import java.util.Scanner;

public class MethodsExercise_1 {

	public static void main(String[] args) {
		System.out.println(getName());
		System.out.println(getAge());

	}
	public static String getName() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Name here: ");
		return s.nextLine();
//		return new Scanner(System.in).nextLine();
	}
	public static int getAge() {
		return new Scanner(System.in).nextInt();
	}

}
