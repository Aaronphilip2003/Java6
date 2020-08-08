import java.io.*;
class String_Reverse
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String s=br.readLine();
        int len=s.length();
        String s1=" ";
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            s1=ch+s1;
        }
        System.out.println("The string in the reverse order is "+s1);
    }
}