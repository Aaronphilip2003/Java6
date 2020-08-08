import java.io.*;
class temp12
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int a=Integer.parseInt(br.readLine());
        int s=0;
        int i=1;
        while(i<=a)
        {
            s+=i;
            i++;
        }
         System.out.println(s);
        }
    }
