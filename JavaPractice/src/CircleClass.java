import org.openqa.selenium.Point;

public class CircleClass {

	Point center;
	double radius;
	
	CircleClass(){
		
	}
	
	CircleClass(Point initialCenter, double initialRadius){
		center = initialCenter;
		radius = initialRadius;
	}
	
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	void setCenter(Point newCenter) {
		center = newCenter;
	}
	
	void setRadius(double newRadius) {
		radius = newRadius;
		
	}
}
