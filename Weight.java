import java.io.*;
class Weight
 {
     public static void main(String args[])throws IOException
      {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the weight of the package");
          int w=Integer.parseInt(br.readLine());
          double amt=0;
          if(w<=10)
           amt=w*20;
          else if(w>10&&w<=30)
          amt=20*10+(w-20)*10;
          else if(w>30&&w<=50)
          amt=20*10+30*10+(w-30)*8;
          else if(w>50)
          amt=20*10+30*10+30*8+(w-50)*5;
          System.out.println("Amount= "+amt);
        }
    }
          