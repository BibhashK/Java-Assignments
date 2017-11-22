package exercise2ofassignment3;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new  Rectangle(10, 20);
		r1.draw();
		r1.area();
		r1.display();
		System.out.println("********************************");
		
		Circle c1 = new Circle(10);
		c1.draw();
		c1.area();
		c1.display();
		System.out.println("********************************");
		
		Square s1 = new Square(15);
		s1.draw();
		s1.area();
		s1.display();
		
		System.out.println("************end of shapes********************");
		
		
	}

}
