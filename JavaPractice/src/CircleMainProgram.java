import org.openqa.selenium.Point;

public class CircleMainProgram {

	public static void main(String[] args) {
		
		CircleClass c1 = new CircleClass(new Point(4,5), 11);
		
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
	}

}
