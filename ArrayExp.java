public class ArrayExp {

	public static void main(String[] args) {
		
		int ar[] = { 1, 2, 3, 4, 5 };
	    try {
	        for (int i = 0; i <= 5; i++)
	            System.out.print(ar[i]+" ");
	    }
	    catch (Exception e) {
	        System.out.println("Arrayindex out of bounds exception");
	    }

	}

}
