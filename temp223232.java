import java.io.*;
class temp223232
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        int len=s.length();
        String s1="";s=s+" ";String w="";
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                (char)(w.charAt(0))=(char)((w.charAt(0)-32));
                s1=s1+w;
                w="";
            }
            else
            w=w+ch;
        }
        System.out.println(s1);
    }
}
 