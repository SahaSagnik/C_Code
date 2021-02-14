import java.util.*;
abstract class student
{
    String name,address;
    double grade;
    int ID,age;
    abstract boolean isPassed (double grade);        
}
    
class Undergrad extends student
{
    boolean isPassed (double g)
    {
        if(g>70.0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Grad extends student
{
    boolean isPassed (double g)
    {
        if(g>80.0)
        {
            return true;
        }
        else
        {
             return false;
        }
    }
}

public class Test
{
    public static void main(String[] args) 
    {
        student u=new Undergrad();
        boolean a=u.isPassed(78.0);   
        student g=new Grad();
        boolean b=g.isPassed (66.0);
        System.out.println("The grade of Undergrad is 78.0 and result is "+a);
        System.out.println("The grade of Grad is 66.0 and result is "+b);
    }
    
}

