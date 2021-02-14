import java.io.*;
public class CGPA
{
   public static void main(String args[])throws IOException
   {
       InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in=new BufferedReader(read);
       String str,s="";;double low=10.0;
       System.out.println("Enter the number of students");
       int n=Integer.parseInt(in.readLine());
       System.out.println("Enter details of student");
       for(int i=0;i<n;i++)
       {
           str=in.readLine();
           int roll=Integer.parseInt(in.readLine());
           double cgpa=Double.parseDouble(in.readLine());
           if(cgpa<low)
           {
               low=cgpa;
               s=str;
            }
       }
       System.out.println("The lowest CGPA is "+low);
       System.out.println("The name is "+s);
   }
}
