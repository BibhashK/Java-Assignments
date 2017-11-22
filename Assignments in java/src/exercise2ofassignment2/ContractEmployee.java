package exercise2ofassignment2;

import exercise1ofassignment2.Employee;

public class ContractEmployee extends Employee{
	
	String duration;
	public ContractEmployee(int empno, String ename, float salary,String duration) {
		super(empno, ename, salary);
		this.duration = duration;
	}
	public void display() {
		
		super.display();
		System.out.println("Duration: " + duration);
	}
	

}
