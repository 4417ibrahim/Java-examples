import java.util.*;
class Rectangle
{
    public static void main(String args[])
    {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        int length=sc.nextInt();
        System.out.println("Enter breath of rectangle");
        
        int breath=sc.nextInt();
        int area=length*breath;
        System.out.println("Area of rectangle"+area);
    }
}
        