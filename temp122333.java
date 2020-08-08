//MOHANDAS KARAMCHAND GANDHI
//GANDHI MOHANDAS KARAMCHAND
import java.io.*;
class temp122333
{
    public static void main(String args[])throws IOException
    
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        int x=s.lastIndexOf(' ');
        String s1="";
        int len=s.length();
        for(int i=0;i<len;i++)
        {
        s1=s1+s.substring(x)+" "+s.substring(0,x);
        break;
    }
        System.out.println(s1.trim());
    }
}
               