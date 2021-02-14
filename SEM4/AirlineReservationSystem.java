import java.util.*;
public class AirlineReservationSystem 
{
    int capacity;
    int seat[]; 
    Scanner sc = new Scanner(System.in);
    public AirlineReservationSystem()
    {
        capacity=0;
        mutator();
    }
    public void mutator()
    {
        capacity=10;
        seat=new int[capacity];
    }
    public void accessor(int i)
    {
        seat[i] = 1;  
    }
    public void choice()
    {
        System.out.println("Enter 1 for Smoking or 2 for NonSmoking ");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1: 
                Smoking();
            break;
            case 2: 
                Nonsmoking();
            break;
            default:
                System.out.println("Wrong choice");
        }
    }

    public void Smoking() 
    {
        for ( int i = 0; i < 5; i++ )
        {
            if ( seat[i] == 0 )  
            {
                accessor(i); 
                System.out.println("Smoking seat no. "+(i+1));
                break;
            }
            else if ( seat[4] == 1 ) 
            {
                if ( seat[9] == 1) 
                {
                    System.out.println("Flight is full..Next flight is in 3 hours..");
                    System.exit(0);
                }
                else 
                {
                    System.out.println("Smoking is full. Would you accept Non-smoking? 1 for Yes 2 for No");
                    int x = sc.nextInt();
                    if ( x == 1 )
                    {
                        Nonsmoking();
                        start(); 
                    }
                    else
                    {
                        System.out.println("Next flight is in 3 hours.");
                        System.exit(0);
                    }
                }
            }
        }
    }   

    public void Nonsmoking() 
    {
        for ( int i = 5; i < 10; i++ )
        {
            if ( seat[i] == 0 ) 
            {
                accessor(i);
                System.out.println("Non-smoking seat no. "+(i+1));
                break;
            }
            else if ( seat[9] == 1 ) 
            {
                if ( seat[4] == 1) 
                {
                    System.out.println("Flight is full..Next flight is in 3 hours..");
                    System.exit(0);
                }
                else 
                {
                    System.out.println("Non-smoking is full. Would you accept Smoking? 1 for Yes 2 for No");
                    int y = sc.nextInt();
                    if ( y == 1 )
                    {
                        Smoking();
                        start(); 
                    }
                    else
                    {
                        System.out.println("Next flight is in 3 hours");
                        System.exit(0);
                    }
                }
            }
        }
    }
    public void start()
    {
        while (true)
        {
            choice();
        }
    }
    public static void main()
    {
        AirlineReservationSystem ob=new AirlineReservationSystem();
        ob.start();
    }
}
