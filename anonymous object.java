class A
{
public void show()
{
    System.out.println("object ");
}
public A()
{
    System.out.println("constructor");
}
}

class hello
{
    public static void main(String []args)
    {
        new A();    // anonymous object  where there is no name is given and there is no reference in memory, cant be reused.
    }
}
