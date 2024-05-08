// addition of matrix.
import java.util.*;
class Addition
{
public static void main (String args[])
{
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int c[][]=new int[2][2];
Scanner sc =new Scanner(System.in);
System.out.println
("Matrix of A");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println
("Matrix of B");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
b[i][j]=sc.nextInt();
}
}
System.out.println
("Matrix of c");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.println(c[i][j]);
}
}
}
}



