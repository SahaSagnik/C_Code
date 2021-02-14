class ArrayBound
{ 
    public static void main (String[] args)  
    { 
        int[] arr = new int[4];   
        try
        { 
            System.out.println("Inside try block"); 
            int i = arr[4]; 
        } 
        catch(ArrayIndexOutOfBoundsException ex) 
        { 
            System.out.println("Exception has been caught"); 
        }        
        System.out.println("Last Message"); 
    } 
} 