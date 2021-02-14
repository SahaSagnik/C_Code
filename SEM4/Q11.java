import java.io.*; 
public class Q11
{ 
    public static void main(String[] args) throws IOException 
    { 
        PrintWriter pw = new PrintWriter("file3.txt"); 
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        int line1 = Integer.parseInt(br.readLine()); 
        br = new BufferedReader(new FileReader("file2.txt")); 
        int line2 = Integer.parseInt(br.readLine());
        int sum=line1+line2;
        pw.println(sum); 
        pw.flush(); 
        br.close(); 
        pw.close(); 
    } 
} 
