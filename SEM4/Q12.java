import java.io.FileInputStream;
import java.io.InputStream;
public class Q12 
{
    public static void main(String[] args) throws Exception 
    {
      InputStream is = null;
      byte[] buffer = new byte[5];
      char c;   
      try
      {
         is = new FileInputStream("output.txt");
         System.out.println("Characters printed:");
         is.read(buffer, 2, 3);
         for(byte b:buffer) 
         {
            if(b == 0)
            c = '-';
            else
            c = (char)b;
            System.out.print(c);
         }
      } 
      catch(Exception e) 
      {
         e.printStackTrace();
      } 
      finally 
      {
        if(is!=null)
            is.close();
      }
   }
}