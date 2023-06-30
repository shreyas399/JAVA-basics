class A 
{
    public A()
    {
        super();
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
        super(5);
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
