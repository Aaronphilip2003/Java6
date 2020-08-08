import java.io.*;
class Sum
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers:");
        int a[]=new int[10];
        int sum=0,sum1=0;
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i++)
        {
            if(a[i]%2==0)
            sum=sum+a[i];
            else
            sum1+=a[i];
        }
        System.out.println("SUM OF EVEN NUMBERS: "+sum);
        System.out.println("SUM OF ODD NUMBERS: "+sum1);
    }
}