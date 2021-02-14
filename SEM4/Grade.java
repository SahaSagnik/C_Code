import java.io.*;
public class Grade
{
   public static void main(String args[])throws IOException
   {
       InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in=new BufferedReader(read);
       System.out.println("Enter the marks of 4 subject");
       int a=Integer.parseInt(in.readLine());
       int b=Integer.parseInt(in.readLine());
       int c=Integer.parseInt(in.readLine());
       int d=Integer.parseInt(in.readLine());
       int tot_marks = (a+b+c+d);
       System.out.println("Total Marks is :"+tot_marks);
       int per=(tot_marks*100)/400;
       System.out.println("Percentage is :"+per+"%");
       if(per>=90)
       System.out.print("O grade");
       else if(per>=80)
       System.out.print("E grade");
       else if(per>=70)
       System.out.print("A grade");
       else if(per>60)
       System.out.print("B grade");
       else if(per>=50)
       System.out.print("C grade");
       else
       System.out.print("Fail");
   }
}
