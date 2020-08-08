import java.util.*;
class Small_Digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
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
            