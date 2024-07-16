import java.util.*;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        // Create a LinkedHashSet to remove duplicates and maintain insertion order
        Set<Integer> set = new LinkedHashSet<>(list);
        
        // Convert the LinkedHashSet back to a list
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        // Create the list with duplicates
        List<Integer> list = Arrays.asList(4, 3, 2, 4, 1, 3, 2);
        
        // Remove duplicates while maintaining order
        List<Integer> result = removeDuplicates(list);
        
        // Print the result
        System.out.println(result);  
    }
}