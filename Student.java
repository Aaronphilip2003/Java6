import java.io.*;
class Student
{
    String name;
    int mm;
    int scm;
    int comp;
    Student()
    {
        name="";
        mm=0;
        scm=0;
        comp=0;
    }
    Student(String n,int m,int sc,int c)
    {
        name=n;
        mm=m;
        scm=sc;
        comp=c;
    }
     void check()
    {
        double avg=(mm+scm+comp)/3;
        
        if(mm>90&&scm>90&&comp>90)
        System.out.println("Science with Computer");
        else if(avg>90)
        System.out.println("Bio-Science");
        else if(avg>80&&avg<90)
        System.out.println("Science with Hindi");
    }
}
        