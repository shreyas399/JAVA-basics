abstract class A
{
     public abstract void show();
     public abstract void config();

    
}
class demo
{
    public static void main(String []args)
    {
        A obj=new A()                                    // in this inner class we dont have to inherit the new class to implement abstract methods
        {
            public void show()
            {
                System.out.println("in inner class");
            }
            public void config()
            {
                System.out.println("in neww show");
            }
        };
        obj.config();
        obj.show();
            
        
    }
}
