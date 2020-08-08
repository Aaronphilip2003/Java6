
import java.io.*;
class Volume
 {
     public static void main(String args[])throws IOException
      {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("---------MENU---------");
          System.out.println("1-Volume of a cube");
          System.out.println("2-Volume of a sphere");
          System.out.println("3-Volume of a cuboid");
          System.out.println("Enter your choice");
          int c=Integer.parseInt(br.readLine());
          switch(c)
           {
               case 1:System.out.println("Enter the length of a side");
               double s=Double.parseDouble(br.readLine());
               System.out.println("The Volume of the cube is "+s*s*s);
               break;
               case 2:System.out.println("Enter the radius of the sphere");
               double r=Double.parseDouble(br.readLine());
               System.out.println("The volume of the sphere is "+4.0/3.0*3.14*r*r*r);
               break;
               case 3:System.out.println("Enter the length,breadth and height of a cuboid");
               double l=Double.parseDouble(br.readLine());
               double b=Double.parseDouble(br.readLine());
               double h=Double.parseDouble(br.readLine());
               System.out.println("The volume of the cuboid is "+l*b*h);
               break;
               default:System.out.println("Choose a valid option"); 
            }
        }
    }
    
               
          