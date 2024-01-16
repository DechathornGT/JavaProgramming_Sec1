
public class Circle {
	//The public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
	//define 2 private attribute
	private double radius;
	private String color;
	
	//Default Constructor
	//1st
	Circle(){
		radius = DEFAULT_RADIUS;
		color = DEFAULT_COLOR;
	}
	
	//Constructor with parameter radius and default color
	//2nd
	Circle(double radius){
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	
	//Constructor with parameter radius and color
	//3rd
	Circle(double radius,String color){
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Circle[radius = "+radius+", color = "+color+"]";
	}
	
	public double getArea() {
		//return radius * radius * Math.PI;
		return getRadius() * getRadius() * Math.PI;
	}
	
	public double getCircumference() {
		return 2.0 * Math.PI * getRadius();
	}
	
	
}
