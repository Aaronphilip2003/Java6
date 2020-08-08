import java.io.*;
class Sum_subscript1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        int os=0,es=0;
        for(int i=0;i<10;i++)
        {
            if(i%2==0)
            es+=a[i];
            else
            os+=a[i];   
        }
        System.out.println("Sum of odd subscript:"+os);
        System.out.println("Sum of even subscript:"+es);
    }
}