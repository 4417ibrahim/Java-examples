import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) 
	{
		// Create and populate a TreeSet
	        TreeSet<Integer> treeSet = new TreeSet<>();
	        treeSet.add(1);
	        treeSet.add(3);
	        treeSet.add(5);
	        treeSet.add(7);
	        treeSet.add(9);
	        treeSet.add(11);
	        treeSet.add(13);

	        // Define the specified element
	        int specifiedElement = 6;

	        // Print the original TreeSet
	        System.out.println("Original TreeSet: " + treeSet);

	        // Call the method to remove elements greater than the specified element
	       removeElementsGreaterThan(treeSet, specifiedElement);

	        // Print the TreeSet after removal
	        System.out.println("TreeSet after removal: " + treeSet);
	    }

	    public static void removeElementsGreaterThan(TreeSet<Integer> set, int value) {
	        // Get a subset of elements greater than the specified value
	        TreeSet<Integer> greaterThanSubset = (TreeSet<Integer>) set.tailSet(value, false);

	        // Remove all elements from the subset
	        set.removeAll(greaterThanSubset);
	    }
	}
	