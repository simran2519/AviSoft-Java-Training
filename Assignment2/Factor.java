package DAY_1.Assignment2;
import java.util.Scanner;
public class Factor
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        System.out.println("The factors of " + n + " are ");
        int count=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("-1");
        }

    }
}
