import java.io.*;
public class Q10
{
   public static void main(String args[])throws IOException {
      
      FileReader fr = new FileReader("output.txt"); 
      char [] a = new char[50];
      fr.read(a);   
      
      for(char c : a)
      {
         System.out.print(c); 
      }
      fr.close();
   }
}