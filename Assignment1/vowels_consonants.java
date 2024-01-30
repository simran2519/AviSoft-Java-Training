package DAY_1.Assignment1;
// 97 to 122
//65 to 90

public class vowels_consonants
{
    public static void main(String[] args)
    {
        String str="ae#zyAbvjhgu*";
        int vowels=0;
        int conso=0;
        int others=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vowels++;
            }
//            else if((ch!='a' && !(ch>=97 && ch<=122)) && (ch!='e' && !(ch>=97 && ch<=122)) && (ch!='i' && !(ch>=97 && ch<=122)) && (ch!='o' && !(ch>=97 && ch<=122)) && (ch!='u' && !(ch>=97 && ch<=122)))
            else if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && (ch>=97 && ch<=122))
            {
                conso++;
            }
            else if( ch>= 65 && ch<=90)
            {
                System.out.println("Only lower Alphabets are allowed");
            }
            else if(!(ch>=97 && ch<=122) && !(ch<=65 && ch>=90))
            {
                others++;
            }
        }
        System.out.println("vowels are " + vowels);
        System.out.println("Consonants are " + conso);
        System.out.println("Other characters are "+ others);

    }
}
