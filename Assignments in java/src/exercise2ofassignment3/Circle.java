package exercise2ofassignment3;

public class Circle extends Shape {
	
	double radius;
	double area;

	public Circle(double radius) {
		
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a circle:");
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		area = 3.14 * radius * radius;
		return area;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle: " + area);
	}
	
	
}
