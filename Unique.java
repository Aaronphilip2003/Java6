import java.io.*;
class Unique
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String");
        String s=br.readLine();
        int flag=0;
        int len=s.length();
        for(int j=65;j<=90;j++)
        {
             int c=0;
        for(int i=0;i<len;i++)
        {
           
            char ch=s.charAt(i);
            if(ch==(char)j||ch==(char)(j+32))
            c++;
        }
        if(c>1)
        {            
        flag=1;
        break;
        }
    }
    if(flag==0)
    System.out.println("UNIQUE");
    else
    System.out.println("NOT");
   }
 } 
        