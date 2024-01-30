package DAY_1.Assignment1;
import java.util.Scanner;
public class count_Digits
{
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in) ;
        System.out.println("Enter a number");
       int n=sc.nextInt();
       int count=0;

       if(n<0)
       {
           n=Math.abs(n);
       }
       else if(n==0)
       {
           count++;
       }
        System.out.println(n);

       while(n>0)
       {
           n=n/10;
           count++;
       }
        System.out.println("The number of digits are: "+ count);

    }
}
