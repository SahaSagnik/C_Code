import java.io.*;
public class Q9
{
    public static void main(String args[])throws IOException
    {
          
          FileReader fr = new FileReader("output.txt"); 
          char [] a = new char[50];
          fr.read(a); String st="",st2="";
          for(char c : a)
          {
              st=st+c;
          }
      System.out.print(st);
      fr.close();
      st=" "+st;
      int l=st.length();
      for(int i=0;i<l-1;i++)
      {
          char ch1=st.charAt(i);
          char ch2=st.charAt(i+1);
          if(ch1==' ' && ch2!=' ')
          {
              if((int)ch2>=97 && (int)ch2<122)
              {
                     //st2=st2+" "+ch2;
                   int x=((int)ch2)-32;
                   ch2=(char)x;
              }
          }   
          st2=st2+ch2;       
      }
      System.out.print(st2); 
   }
}
