package exercise1ofassignment3;

public class ScienceStudent extends Student {
	
	int Physicsmarks;
	int mathsmarks;
	int chemistrymarks;
	static int noofstudents = 0;
	float percentage;
	
	public ScienceStudent(String name, int standard, int physicsmarks, int mathsmarks, int chemistrymarks) {
		super(name, standard);
		Physicsmarks = physicsmarks;
		this.mathsmarks = mathsmarks;
		this.chemistrymarks = chemistrymarks;
		noofstudents +=1;
		
	}
	
	
	public void getPercentage() {
		// TODO Auto-generated method stub
		 percentage = ((Physicsmarks +  mathsmarks + chemistrymarks)/3);
		
		 System.out.println("Student name: " + name+"\n" + "Standard: " + standard );
		System.out.println("percentage of science student: " + percentage);
	}
 public static int getTotalNumberOfStudents() {
		 
		System.out.println("number of students science: "+ noofstudents);
		 return noofstudents;
	 }
	

}
