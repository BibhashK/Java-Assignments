package exercise2ofassignment3;

public class Rectangle extends Shape {
	
	double length;
	double breadth;
	double area;
	public Rectangle(double length, double breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a rectangle");
		
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		area = length * breadth;
		
		return area;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle: " + area);
	}
	
	
}
