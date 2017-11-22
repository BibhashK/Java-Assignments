package exercise3ofasignment3;

public class Clerk extends Employee {

	int speed;
	int accuracy;
	
	
	public Clerk(int speed, int accuracy) {
		super();
		this.speed = speed;
		this.accuracy = accuracy;
	}

	public int getSpeed() {
		return speed;
	}
	
	public int getAcuuracy() {
		return accuracy;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
}
