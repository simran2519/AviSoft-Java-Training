package DAY_1.Assignment1;

public class ToggleChar
{
    public static void main(String[] args)
    {
        String str="Ab#$Cd";
        String g="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>=97 && ch<=122)
            {
                g=g+(char)(ch-32);
            }
            else if(ch>=65 && ch<=90)
            {
                g=g+(char)(ch+32);
            }
            else {
                g = g + ch;
            }
        }
        System.out.println(g);
    }
}
