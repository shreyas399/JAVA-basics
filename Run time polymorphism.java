

class A
{
    public void hey()
    {
        System.out.println("in A");
    }

}

class B extends A                       // run time polymorphism
{
    public void hey()
    {
        System.out.println("in B");
    }
}

class Demo
{
    public static void main(String []args)
    {
        A obj =new A();
        obj.hey();

        obj = new B();
        obj.hey();

    }
} 
    
