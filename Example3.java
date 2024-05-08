
import java.util.*;
class Example3 {
    public static void main(String[] args) {
        int i=0,j=1,k,n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your range");
        n=sc.nextInt();
        k=i+j;
        while(k<n)
        {
            System.out.println("fibnoicc series  are "+ k);
            i=j;
            j=k;
            k=i+j;
            
        }
    }
}