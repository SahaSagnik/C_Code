import java.util.*;
interface Inter
{
    void earnings();
    void deduction();
    void bonus();
}

abstract class Manager implements Inter
{   
   
    Scanner sc=new Scanner(System.in);
    double basic=sc.nextDouble();
    double da=sc.nextDouble();
    double hra=sc.nextDouble();
    public void earnings()
    {
        double er=basic+(da*(0.8*basic))+(hra*(0.15*basic));
        System.out.println("Earning is "+er);
    }
    public void deduction()
    {
           double pf=0.12*basic;
           System.out.println("Deduction is "+pf);
    }
}

public class Substaff extends Manager
{
    public void bonus()
    {
        double b=0.5*basic;
        System.out.println("Bonus is "+b);
    }
    public static void main(String[] args) 
    {
        Substaff ob=new Substaff();
        ob.earnings();
        ob.deduction();
        ob.bonus();
    }
}
