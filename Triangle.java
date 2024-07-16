import java.util.*;
class Triangle
{
    public static void main(String args[])
    {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter sides of values a triangle:");
        int side1=sc.nextInt();
        
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        
        if((side1==side2) && (side2==side3) && (side1==side2)) 
        {
            
            System.out.println("It is a equilateral triangle");
        }
       else if((side1==side2)||(side2==side3)||(side3==side1))
       {
           System.out.println("it is a isosceles");
       }
       else
       {
           System.out.println("It is a Scalar Triangle");
       }
        
    }
}
        
            
            

