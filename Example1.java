// Example of stock of rice bags in super market.
import java.util.*;
class Example1
{
public static void main (String [] args)
{
Scanner sc =new Scanner(System.in);
int stock[]=new int [5];
String[] Rice_name=new String[5];
for(int i=0;i<5;i++){
System.out.println("Enter rice name:");
Rice_name[i]=sc.next();
System.out.println("Stock of rice :");
stock[i]=sc.nextInt();
}
for(int i=0;i<5;i++){
System.out.println(Rice_name[i]+"=" +stock[i]);
}
}
}

