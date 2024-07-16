import java.util.*;


public class Replace {

	public static void main(String[] args) {
	

				        ArrayList<String> colorList = new ArrayList<>();
		        colorList.add("Red");
		        colorList.add("Blue");

		        System.out.println("Original array list: " + colorList);

		        String newColor = "White";
		        colorList.set(1, newColor); // Replace the second element with 'White'

		        System.out.println("Updated array list: " + colorList);
		    }
		}





