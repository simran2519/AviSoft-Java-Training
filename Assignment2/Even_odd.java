package DAY_1.Assignment2;
import java.util.Scanner;
public class Even_odd
{
    public static void main(String[] args)
    {
      Scanner sc= new Scanner(System.in)  ;
      System.out.println("Enter a number");
      int n= sc.nextInt();
      int EvenSum=0;
      int OddSum=0;
      while(n>0)
      {
          int ld= n%10;
          if(ld%2==0)
          {
              EvenSum=EvenSum+ld;
              System.out.println(ld);
          }
          else if(ld%2!=0)
          {
              OddSum=OddSum+ld;
          }
          n=n/10;
      }
        System.out.println("The sum of Even Digits " + EvenSum);
        System.out.println("The sum of Odd Digits " + OddSum);
    }
}
