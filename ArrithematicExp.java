public class ArrithematicExp {
	void divide(int a, int b)  
	{  
	// performing division and storing the result  
	int res = a / b;  
	System.out.println("Division process has been done successfully.");  
	System.out.println("Result came after division is: " + res);  
	} 

	


	public static void main(String[] args) {
		
		ArrithematicExp ae=new ArrithematicExp();
		ae.divide(20, 0);
		
	}
}
