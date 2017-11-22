package exercise4;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[] = {10,20,30,40,40};
		
		
		int sum=0;
		for(int i=0;i<x.length;i++){
			sum = sum + x[i];
			
		}
		System.out.println("sum of elements of arra: " + sum );
		
		for(int i=0;i<x.length;i+=2){
			System.out.println("for even position: " + x[i]);
			}
		
		for(int i=1;i<x.length;i+=2){
			System.out.println("for odd position: " +x[i]);
			}
		
		for(int i=x.length-1;i>=0;i--){
			System.out.println("for reverse position: " + x[i]);
			}
		
	}

}
