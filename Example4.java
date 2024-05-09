import java.util.*;
import java.io.*;
class Example4
{
    public static void main(String args[])
    
    {
        Scanner sc=new Scanner(System.in);
        String str,nstr=" ";
        char ch;
        System.out.println("Enter your String:");
            str=sc.next();
              
        for(int i=0;i<str.length();i++)
        {
           ch=str.charAt(i);
           nstr=ch+nstr;
        }
           System.out.println("Reverse of a string:"+nstr);
           
         
    if (str==nstr) 
        
            System.out.println("Given String is  palindrome");
        
        else
        
             System.out.println("Given String is not palindrome");
        
        
    }
}