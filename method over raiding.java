class A
{
    public void hey()
    {
        System.out.println("hey");
    }

}

class B extends A                       // method over riding,   in this the letest class gets more preference
{
    public void hey()
    {
        System.out.println("hii");
    }
}

class Demo
{
    public static void main(String []args)
    {
        B obj =new B();
        obj.hey();
    }
}
