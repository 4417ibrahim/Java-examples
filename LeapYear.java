
import java.util.*;
class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Reading input from user
        System.out.println("Enter a Year:");
        int year=sc.nextInt();

        if(year%4==0 || year%400==0)

        System.out.println("The given year is leap year");
        else

        System.out.println("The given year is not leap year");
    }
}