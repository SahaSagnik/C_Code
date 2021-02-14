import java.util.Scanner;
abstract class student
{
    int roll;
    int reg;
    abstract void course();
    
}

class kiitian extends student
{
    void course()
    {
        System.out.println("Course is B.tech in CSE");
    }
}

public class Abs 
{
    public static void main(String[] args) 
    {
        student s=new kiitian();
        s.course();
    }
    
}

