
public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle(double width,double length,String color) {
		super(color);
		this.width = width;
		this.length = length;
		
	}
	@Override
	public double getArea() {	//method getArea() --> abstract method from SuperClass
		return this.width * this.length;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	@Override
	public String toString() {
		return "Rectangle[width = "+this.width+",length = "+this.length+" ,"+super.toString()+"]";
	}
	
}
