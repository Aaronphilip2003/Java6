//if it rains then ill go to play
//If It Rains Then Ill Go To Play
import java.io.*;
class Str1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        s=" "+s;
        String s1="";
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                char ch1=s.charAt(i+1);
                s1=s1+' '+Character.toUpperCase(ch1);
                i=i+1;
            }
            else
            s1=s1+ch;
        }
        System.out.println(s1);
    }
}
                