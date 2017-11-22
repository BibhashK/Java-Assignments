package exercise1ofassignment3;

public class HistoryStudents extends Student {
	
	int historyMarks;
	int civicsMarks;
	static int noofstudents = 0;
	public HistoryStudents(String name, int standard, int historyMarks, int civicsMarks) {
		super(name, standard);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
		noofstudents ++;
	}
	

	public void getPercentage() {
		// TODO Auto-generated method stub
		int percentage = ((historyMarks +  civicsMarks)/2);
		
		System.out.println("percentage of History student: " + percentage);
	}
 public static int getTotalNumberOfStudents() {
		 
	 System.out.println("number of students History: "+ noofstudents);
		 return noofstudents;
	 }
}
