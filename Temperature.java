import java.io.*;
class Temperature
 {
     public static void main(String args[])throws IOException
      {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("---------MENU---------");
          System.out.println("1-Celsius to Fahrenheit");
          System.out.println("2-Fahrenheit to Celsius");
          int t=Integer.parseInt(br.readLine());
          switch(t)
          {
              case 1:System.out.println("Enter your value in the Celsius Scale");
              double c=Double.parseDouble(br.readLine());
              double f=1.8*c+32;
              System.out.println("Your value in the Fahrenheit Scale is "+f);
              break;
              case 2:System.out.println("Enter your value in the Fahrenheit Scale");
              f=Double.parseDouble(br.readLine());
              c=5.0/9.0*(f-32);
              System.out.println("Your value in the Celsius Scale is "+c);
              break;
              default:System.out.println("Choose the correct option");
            }
        }
    }
       