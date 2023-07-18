class A
{
    public void show()
    {
        System.out.println("in show");
    }
}

class demo
{
    public static void main(String []args)
    {
        A obj=new A()
        {
            public void show()
            {
                System.out.println("in inner ananamous class");
            }
        };
        obj.show();
    }
}
