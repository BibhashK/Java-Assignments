package exercise2ofassignment3;

public class Square extends Shape {

	double side;
	double area;

	public Square(double side) {
		
		this.side = side;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a Square:");
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		
		area = side * side;
		return 0;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area of Square: " + area);
	}
	
	
}
