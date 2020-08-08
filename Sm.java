import java.io.*;
class Sm
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int a=Integer.parseInt(br.readLine());
        int min=9;
        while(a>0)
        {
            int r=a%10;
            if(r<min)
            min=r;
            a=a/10;
        }
        System.out.println(min);
    }
}
         