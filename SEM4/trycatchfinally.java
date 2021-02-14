class trycatchfinally
{ 
    public static void main (String[] args)  
    { 
        try
        { 
            if(18>20)
            {
                System.out.println("No exception");
            }
            else
            {
                System.out.println("Exception has been caught"); 
            }
        } 
        catch(ArithmeticException e) 
        { 
            System.out.println(e); 
        }  
        finally
        {
            System.out.println("Inside finally block");
        }
        System.out.println("Last Message"); 
    } 
} 