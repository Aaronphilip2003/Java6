class Series12
{
    public static void main(int n)
     {
         int i,p=1,sum=0;
         for(i=2;i<=n;i+=2)
         {
             System.out.print(i*p+" ");
             p*=-1;
             sum+=i;
            }
            System.out.println();
            System.out.print(sum);
        }
    }
    