public class Vowles {
	 	public static void main(String[] args) {
	        String str = "Welcome to my world";
	        int vowels = 0;
	        int consonants = 0;
	        
	        // Convert the string to lowercase to simplify comparison
	        str = str.toLowerCase();
	        
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }
	        
	        System.out.println("Number of vowels: " + vowels);
	        System.out.println("Number of consonants: " + consonants);
	    }
	}
	 	
	
