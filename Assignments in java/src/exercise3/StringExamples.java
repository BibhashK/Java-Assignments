package exercise3;

public class StringExamples {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		String string1= "Hello There ";
		String string2= "How are you";
		
		String s3 = string1.concat(string2);
		System.out.println("String s3:" + s3);
		
		//get length
		
		System.out.println("length Of String 1: " + string1.length());
		System.out.println("length Of String 2: " + string2.length());
		System.out.println("length Of String 3: " + s3.length());
		
		//get substring 
		System.out.println("Sub: " + s3.substring(0, 5));
		//uppser case
		System.out.println("Upper: " + s3.toUpperCase());
	}

}
