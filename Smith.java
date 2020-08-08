import java.io.*;
class Smith
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int a=Integer.parseInt(br.readLine());
        int copy=a,sum=0;int c=0;int b[]=new int[100];int k=0;int sum1=0;int sum2=0;int c1=0;int j=1;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            c++;
        }
        if(c==2)
        System.out.println("NOT A SMITH NUMBER:");
        else
        {
            while(a>0)
            {
                int r=a%10;
                sum+=r;
                a=a/10;
            }
            for(int i=2;i<copy;i++) 
            {
                if(i%j==0)
               {
                   c1++;j++;
                }
                if(c1==2)
                {
                if(copy%i==0)
                b[k++]=i;
                while(b[k]>0)
                {
                    int r=b[k]%10;
                    sum1+=r;
                    b[k]/=10;
                }
                sum2+=sum1;
            }
        }
        if(sum==sum2)
        System.out.println("SMITH NUMBER");
        else
        System.out.println("NOT A SMITH NUMBER");
    }
}
}

                
                
            
    