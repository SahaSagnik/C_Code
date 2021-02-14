import java.io.*;
class ExceptionExample
{
   public static void main(String args[])throws IOException
   {
      InputStreamReader read=new InputStreamReader(System.in);
      BufferedReader in=new BufferedReader(read);
      int a,b,c;
      try
      {
         a=Integer.parseInt(in.readLine());
         b=Integer.parseInt(in.readLine());
      }
      catch(Exception ex) 
      {
         System.out.println("Catch 1");
      }
      try 
      {
         c=100/0;
         System.out.println(c);
      }
      catch(ArithmeticException e)
      {
         System.out.println(" Arithmatic Catch");
      }    
      catch(Exception ex) 
      {
         System.out.println("Catch 2");
      }
   }
}