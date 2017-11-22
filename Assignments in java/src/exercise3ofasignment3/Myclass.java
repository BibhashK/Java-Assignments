package exercise3ofasignment3;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1 = new Manager("General");
		m1.setEmpid(101);
		m1.setName("Harrish Mehra");
		m1.setSalary(50000);
		
		System.out.print("Name: "+ m1.getName()+"\n" +"Empid : " + m1.getEmpid()+"\n" + "Salary : " + m1.getSalary()+"\n");
		
		Clerk c1 = new Clerk(200, 95);
		c1.setEmpid(201);
		c1.setName("Rohan Chand");
		c1.setSalary(25000);
		
		System.out.println("Name: "+ c1.getName()+"\n" +"Empid : " + c1.getEmpid()+"\n" + "Salary : " + c1.getSalary());
	}

}
