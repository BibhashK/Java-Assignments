package exercise1ofassignment2;

public class Employee {
	
	int empno;
	String ename;
	float salary;
	public Employee(int empno, String ename, float salary) {
		
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	
	public void display() {
		
		System.out.println("Employee No: " + empno +"\n"+ "Employee name:" + ename+"\n"+
							"Salary: " + salary) ;
	}
	
}
