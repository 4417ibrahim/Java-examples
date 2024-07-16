import java.util.*;
class Movie_Ticket
{
    public static void main(String args[])
    {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your Booking time:");
        int time=sc.nextInt();
        if(age<=5 || age>=60)
        {
            int price=0;
            System.out.println("Issue a free ticket:"+price);
        }
        else if(time>=10&&time<=12)
        {
            int price =250;
            System.out.println("The price of the ticket will be  "+price);
            }
            else if(time>=5&&time<=9)
            {
            int price =300;
            System.out.println("The price of the ticket will be: "+price);
            }
            else if(time>=1 && time<=4)
            {
                int price=200;
                System.out.println("The price  of ticket will be:"+price);
            }
    }
}