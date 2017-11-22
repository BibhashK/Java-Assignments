package exercise1ofassignment3;

public class AllStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------!---SCIENCE---------------");
		ScienceStudent s1 = new ScienceStudent("Harry", 12, 80, 85, 89) ;
		ScienceStudent s2 = new ScienceStudent("Jones", 12, 83, 82, 90) ;
		s1.getPercentage();
		s2.getPercentage();
		s1.getTotalNumberOfStudents();
		System.out.println("-----------------------------!---History----------- ");
		
		HistoryStudents h1 = new HistoryStudents("yohan", 12, 90, 85);
		HistoryStudents h2 = new HistoryStudents("Mohan", 12, 94, 89);
		h1.getPercentage();
		h2.getPercentage();
		h1.getTotalNumberOfStudents();
		System.out.println("-------------------------end------------------------------");
		System.out.println("----------------------****WELL DONE**!!!------------------------------");
		
		
	
		
		
		

	}

}
