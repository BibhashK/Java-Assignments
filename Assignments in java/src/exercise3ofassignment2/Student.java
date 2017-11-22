package exercise3ofassignment2;

public class Student {
	
	int rollno;
	String sname;
	String course;
	static String instituteName = "Sathyabama University";
	
	
	public Student(int rollno, String sname, String course) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.course = course;
	}
	
	public void display() {
		System.out.println("Rollno: " + rollno+"\n"+ "Student name: " + sname+"\n"+
	                        "Course: " + course);
		System.out.println("Institute Name: " + instituteName);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(21, "Sahne", "B.Tech Cse");
		s1.display();
	}

}
