import java.util.*;

public class Sorting {

	public static void main(String[] args) {


		// Java Program to Sort an ArrayList
		 
		// import java.util package
		
		 
				        // Define an objects of ArrayList class
		        ArrayList<String> list = new ArrayList<String>();
		 
		        // Adding elements to the ArrayList
		        list.add("India");
		        list.add("Pakistan");
		        list.add("Srilanka");
		        list.add("USA");
		        list.add("Australia");
		        list.add("Japan");
		 
		        // Printing the unsorted ArrayList
		        System.out.println("Before Sorting : " + list);
		 
		        // Sorting ArrayList in ascending Order
		        Collections.sort(list);
		 
		        // printing the sorted ArrayList
		        System.out.println("After Sorting : " + list);
		    
		

	}

}
