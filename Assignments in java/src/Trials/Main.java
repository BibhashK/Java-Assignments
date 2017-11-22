package Trials;

public class Main {
	int instanceVar;
	static int staticvar;
	{
		instanceVar =10;
		System.out.println("in instance block; " + instanceVar);
	}
	static {
		staticvar = 5;
		System.out.println("in static Block: " +staticvar);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main bj = new Main();

	}

}
