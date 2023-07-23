class demo
{
  public static void main(String []args)
  {
    int i=2;
    int j=0;
    int arr[]=new int[5];


   

    try
    {
      j=18/i;
      System.out.println(arr[5]);
    }

    catch(ArrayIndexOutOfBoundsException e)
    {                                                                                 //ther is only one exception can be executed in try method
      System.out.println("There is an arrayout of bond exception error" + e);
    }

  catch(ArithmeticException e)
  {
    System.out.println("there is an arithmatic error" + e);
  }

  System.out.println(j);
  System.out.println("hey");

  }
}
