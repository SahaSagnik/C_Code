import java.io.*;
class Palindrome
{  
    public static void main(String args[])throws IOException
    {  
        int sum=0,temp;     
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the number");
        int num=Integer.parseInt(in.readLine());
        int copy=num;    
        while(num>0)
        {    
            temp=num%10;  
            sum=(sum*10)+temp;    
            num=num/10;    
        }    
        if(copy==sum)    
        System.out.println("Palindrome number ");    
        else    
        System.out.println("Not palindrome");    
    }  
}  