import java.io.*;
class NegativeNumberException extends Exception
{
        public NegativeNumberException(String x)
        {
            super(x);
        }
    }
public class Process
{
             static void processinput(int x)throws NegativeNumberException
                    {
                    if(x<0)
                        throw new NegativeNumberException("Negative Number Exception");
                    else
                    {
                         double d=x;
                         System.out.println(d);
                    }
                }
        public static void main(String args[])throws IOException
        {
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader in=new BufferedReader(read);
            try
            {
                int x;
                System.out.println("Enter a number");
                x=Integer.parseInt(in.readLine());
                 
                processinput(x);
            }
            catch(Exception e)
            {
                System.out.println("Negative" +e);
            }    
            finally
            {
              System.out.println("finally !");
            }
        }
    }  