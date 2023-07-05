final class A  
{
    public final void show()
    {
        System.out.println("hey");
    }
}

// class B extends A
// {
//     public final void show()                       final class cannot be extended
//     {
//         System.out.println("hey");
//     } 
// }

 class C  
{
    public final void show()
    {
        System.out.println("hey");
    }
}

//  class D extends C 
// {
//     public final void show()                final method cannot be re used
//     {
//         System.out.println("hey");
//     }
// }

class demo
{  
    public static void main(String []args)
  {
    final int b=20;
    //b=25;                                       final variable cannot be  changed
    System.out.println(b);
  }
}

