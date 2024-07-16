import java.util.*;
class Calculator{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
            
            System.out.println("choose your choice 1.Add 2.sub 3.mul 4.div");
            int  value = sc.nextInt();
            System.out.println("Enter first number:");
            int num1=sc.nextInt();
            System.out.println("Enter second number:");
        int num2=sc.nextInt();
    int result;
    
            switch(value)
            {
                case 1:result=num1+num2;
                       System.out.println("The Addition of values are "+result);
                       break;
                                       case 2:result=num1-num2;
                       System.out.println("The Substraction of values are "+result);
                       break;
                                       case 3:result=num1*num2;
                       System.out.println("The Multiplication of values are "+result);
                       break;
                                       case 4:if(num2==0)
                                       {
                                       System.out.println("Division is not possible with zero ");
                                       }
                                       else
                                       {
                                       result=num1/num2;
                       System.out.println("The Division of values are "+result);
                                       }
                       break;
                                       default :
                       System.out.println(" Invalid option");
                       break;
            }
                
            }
            
}