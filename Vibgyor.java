import java.io.*;
class Vibgyor
 {
     public static void main(String args[])throws IOException
      {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the first charcter of any colour in VIBGYOR to know the full name of the colour");
          char c=(char)br.read();
          switch(c)
          {
              case 'V':System.out.println("VIOLET");
              break;
              case 'v':System.out.println("VIOLET");
              break;
              case 'I':System.out.println("INDIGO");
              break;
              case 'i':System.out.println("INDIGO");
              break;
              case 'B':System.out.println("BLUE");
              break;
              case 'b':System.out.println("BLUE");
              break;
              case 'G':System.out.println("GREEN");
              break;
              case 'g':System.out.println("GREEN");
              break;
              case 'Y':System.out.println("YELLOW");
              break;
              case 'y':System.out.println("YELLOW");
              break;
              case 'O':System.out.println("ORANGE");
              break;
              case 'o':System.out.println("ORANGE");
              break;
              case 'R':System.out.println("RED");
              break;
              case 'r':System.out.println("RED");
              break;
              default:System.out.println("The first character that you have entered is not in VIBGYOR");
            }
        }
    }