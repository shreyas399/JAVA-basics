class A 
{
    public A()
    {
        super();                             // super is used to call the particular constructors in multiple constructors
        System.out.println("this is a");
    }

    public A(int a)
    {
        super();
        System.out.println("this is detailed");
    }

}

class B extends A
{
    public B() 
    {
        super();
    System.out.println("this is b");
    }

    public B(int n)
    
    {
        super();
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


