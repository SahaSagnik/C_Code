import java.util.Scanner;
interface motor
{
     int capacity=0;
     void run();
     void consume();
}

class washingmachine implements motor
{
    public void run()
    {
        System.out.println("Washing machine");
    }
    public void consume()
    {
           System.out.println("Consuming power");
    }
}

public class test_interface 
{
    public static void main(String[] args) 
    {
        motor m=new washingmachine();
        System.out.println("Capacity is:"+m.capacity);
        m.run();
        m.consume();
    }
}
