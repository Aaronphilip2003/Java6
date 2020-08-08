import java.io.*;
class Sum_subscript
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers");
        int a[]=new int[10];
        int s=0,s1=0;
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i+=2)
        s+=a[i];
        for(int i=1;i<10;i+=2)
        s1+=a[i];
        System.out.println("Sum of odd subscript:"+s1);
        System.out.println("Sum of even subscript:"+s);
    }
}