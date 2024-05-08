import java.util.*;
class Example
{
public static void main(String[] args)
{
int age[]=new int[5];
int birth_year;
int current_year;
int temp;
Scanner sc =new Scanner(System.in);
for(int i=0;i<5;i++)
{
System.out.println("Enter your Birth year :");
birth_year=sc.nextInt();
System.out.println("Enter your Current  year :");
current_year=sc.nextInt();
age[i]=current_year-birth_year;
}
for(int i=0;i<5;i++)
{
System.out.println("Age of Student"+ age[i]);
}
for(int i=0;i<5;i++)
{
for(int j=i+1;j<5;j++)
{
if(age[i]<age[j])
{
temp=age[i];
age[i]=age[j];
age[j]=temp;
}
}
}
for
(int i=0;i<5;i++)
{
System.out.println("Age in Descending order is"+age[i]);
}
}
}




