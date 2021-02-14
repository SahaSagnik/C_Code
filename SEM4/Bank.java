class account
{
    int ac_no;
    int balance;
    public void get(int a,int b)
    {
        ac_no=a;
        balance=b;
    }
    public void display()
    {
        System.out.println("account number: "+ac_no);
        System.out.println("balance: "+balance);
    }
}
class person extends account
{
    int aadhar;
    String name;
    public void put(int c,String d)
    {
        aadhar=c;
        name=d;
    }
    public void display()
    {
        super.display();
        System.out.println("Aadhar no.: "+aadhar);
        System.out.println("Name is: "+name);
    }
}
public class Bank
{
    public static void main(String args[])
    {
        person p1=new person();
        person p2=new person();
        person p3=new person();
        person p4=new person();
        person p5=new person();
        
        p1.get(101,5000);
        p1.put(1,"Dhoni");
        p2.get(102,6000);
        p2.put(2,"Rohit");
        p3.get(103,7000);
        p3.put(3,"Virat");
        p4.get(104,4500);
        p4.put(4,"Rahul");
        p5.get(105,2000);
        p5.put(5,"Shami");
        //System.out.println("Person 1:");
        p1.display();
        //System.out.println("Person 2:");
        p2.display();
        //System.out.println("Person 3:");
        p3.display();
        //System.out.println("Person 4:");
        p4.display();
        //System.out.println("Person 5:");
        p5.display();
    }
}

