import java.io.*;
class Sum_of_digits2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int a=Integer.parseInt(br.readLine());
        int sum=0;
        while(a>0)   
        {
            int r=a%10;
            sum=sum+r;
            a=a/10;
        }
        System.out.println("Sum of the digits: "+sum);
    }
}
      