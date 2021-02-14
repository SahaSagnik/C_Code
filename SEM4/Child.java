class Child extends Parent
{
 	public void func()
 	{  
 		System.out.println("Child"); 
	}

 	public static void main(String[] args)
 	{
   		//Parent a = new Parent();
   		Parent b = new Child();
   		b.func();
   		//a = b;	
   		//a.func();	
 	}
}