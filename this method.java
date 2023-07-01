class A 
{
    public A()
    {
        
        System.out.println("this is a");
    }

    public A(int a)
    {
       
        System.out.println("this is detailed");
    }

}

class B extends A
{
    public B() 
    {
        
    System.out.println("this is b");
    }

    public B(int n)
    
    {
        this();                                 // this usually call the all constructors of that class
        System.out.println("this is  in detailed");
    }
}

public class hello
{
    public static void main(String []args)
    {
        B obj =new B(50);
    }
}
