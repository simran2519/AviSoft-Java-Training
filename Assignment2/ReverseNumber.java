package DAY_1.Assignment2;
import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int original=n;
        int rev=0;
        while(n>0)
        {
            int ld=n%10;
            rev= (rev*10)+ld;
            n=n/10;
        }
        System.out.println(rev);

    }
}
