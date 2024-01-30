package DAY_1.Assignment2;

public class UniqueCharacters
{
    public static void main(String[] args)
    {
        String str="abbbbaapaaaccccgcab";
        String g="";
        int i,j;
        for(i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int count=0;
            for(j=0;j<str.length();j++)
            {
              char ch1=str.charAt(j);
              if(ch==ch1)
              {
                  count++;
              }
            }
            if(count==1)
            {
                g=g+ch;
            }
        }
        System.out.println(g);

    }
}
