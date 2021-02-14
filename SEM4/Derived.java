import java.io.*;
class Derived extends Base
{ 
    int m;
    Derived()
    {
        super(10);
        m=20;
        System.out.println("Derived Class");
    }
} 
class Test 
{ 
    public static void main(String[] args) 
    { 
        Derived ob = new Derived();  
    } 
}       