package exercise2;

public class Student {
	
	int rollno = 1;
	String studentName = "harsh";
	float mathsMarks = 70.0f;
	float scienceMarks = 80.0f;
	float socialMarks  = 80.0f;
	float englisMarks  = 80.0f;
	float teleguMarks  = 85.0f;
	float hindiMarks   = 88.0f;
	float totalMarks;   
	float average;
	String grade;
	
	
	public void calculateTotalMarks() {
		
		totalMarks = mathsMarks + scienceMarks + socialMarks + englisMarks + teleguMarks 
				      + hindiMarks ;
				     
	}
	public void calculateAverageMarks() {
		
		average = ((totalMarks)/600)*100;
	}
	public void calculateGrade() {
		
		if(average >= 80) {
			grade = "Distinction";
		}
		else if(average >=60 && average <80) {
			grade = "First Class";
		}
		else if(average >=50 && average <60) {
			grade = "Second Class";
		}
		else if(average >=40 && average <50) {
			grade ="Third Class";
		}
		else if(average <40) {
			grade = "fail";
			
		}
	}
	public void displayStudentdetails() {
		System.out.println("Rollno- " +rollno+"\n" + "Student Name: " + studentName);
		System.out.println("Maths: " +mathsMarks+"\n" + "Science: "+ scienceMarks+"\n" + "Social: " +socialMarks+"\n" +
		"english: "+ englisMarks+"\n"  + "telegu: "+ teleguMarks+"\n" + "hindi: "+ hindiMarks);
		System.out.println("Total Marks; " + totalMarks);
		System.out.println("average: " + average);
		System.out.println("grade: " + grade);
							
	}
}
