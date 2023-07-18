interface A                          //interfaces are like blueprints for a project or designs
{
    public void show();
    public void volume();
}
class B implements A
{

   
    public void show() {
       System.out.println("in show");
        
    }

   
    public void volume() {
        System.out.println("in volume");
        
    }
  
}

class demo
{
    public static void main(String []args)
    {

        // A obj=new A() 
        // {
        //     public void show()
        //     {
        //         System.out.println("in inner");
        //     }
        //     public void volume()
        //     {
        //         System.out.println("i inner");
        //     }
        // };
        // obj.volume();
        // obj.show();
        B obj=new B();
        obj.show();
        obj.volume();
    }
}
