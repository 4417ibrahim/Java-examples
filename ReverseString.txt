public class ReverseString {

	public static void main(String[] args) {
	// Users String
String str="welcome to java";
String str1=" ";
char ch;
System.out.println("the String is:"+ str);
//Reversing a String
for(int i=0;i<str.length();i++)
{
	ch=str.charAt(i);
	  str1=ch+str1;
	
}
System.out.println("The reverse of a string is:"+ str1);

	}

}
