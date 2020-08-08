import java.io.*;
class Specialword
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        s=s+" ";
        int len=s.length();
        String s1="",w="";
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            char ch1=s.charAt(0);
            char ch2=s.charAt(len-1);
            if(ch==' ')
            {
                if(w.equals(s1))
                {
                System.out.println("PALINDROME AND SPECIAL");
                w="";
                s1="";
               }
               else if(ch1==ch2)
               {
                   System.out.println("SPECIAL");
                   w="";
                   s1="";
                }
            }
            else
           {
            w=w+ch;
            s1=ch+s1;
        }
        }
        System.out.println(s1);
    }
}