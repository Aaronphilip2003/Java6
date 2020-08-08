import java.util.*;
class Weight_Selection
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weights of 10 students:");
        int a[]=new int[10];int min=0;int temp=0;
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            min=i;
            for(int j=i+1;j<10;j++)
            {
                if(a[min]>a[j])
               { min=j;}
            temp=a[min];
            a[min]=a[j];
            a[j]=temp;
        }
    }
        for(int i=0;i<10;i++)
        System.out.println(a[i]);
    }
}
