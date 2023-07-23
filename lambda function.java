interface A
{
public void show();
}
// class B implements A{
//   public void show()
//   {
//     System.out.println("in B show");
//   }
// }

class demo
{
  public static void main(String []args)
  {
    A obj=()->
    {
      System.out.println("in A show");  // lambda function
    };

    obj.show();
    
    
  }
}
