import java.io.*;
public class Name
{
   public static void main(String args[])throws IOException
   {
       InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in=new BufferedReader(read);
       System.out.println("Enter first name and last name");
       String f=in.readLine();
       String l=in.readLine();
       System.out.println(l+" "+f);
    }
}
       