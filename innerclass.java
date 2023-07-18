class demo
{
    public void het()
    {
        System.out.println("hey tis is outer class");
    }

    class B
    {
        public void show()
        {
            System.out.println("this is inner class");
        }
    }
}

class emo
{
public static void main(String []args)
{

 demo obj =new demo();
 obj.het();

 demo.B obj1=obj.new B();
 obj1.show();

  
}


}
