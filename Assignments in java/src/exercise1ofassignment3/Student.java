package exercise1ofassignment3;

public abstract class Student {
	 String name;
	 int standard;
	
	public Student(String name, int standard) {
		
		this.name = name;
		this.standard = standard;
	}
	 public  abstract void  getPercentage();
		 
	 public static int getTotalNumberOfStudents() {
		 
		 int  totalnumberofstudents = 0;
		 return totalnumberofstudents;
	 }
	 
}
