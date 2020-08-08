import java.io.*;
class Reverse_2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int a=Integer.parseInt(br.readLine());
        int rev=0,temp=a;
        while(a>0)
        {
            int r=a%10;
            rev=(rev*10)+r;
            a=a/10;
        }
        System.out.println("REVERSE OF "+temp+" IS:"+rev);
    }
}
            