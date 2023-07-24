class demo
{
  public static void main(String []args)
  {
    int i=20;
    int j=0;



   

    try
    {
      j=18/i;                                                         //in this case there is no exception but we are givin the condition
      if (j==0)
      throw new ArithmeticException("exception is handelled here");   //calling the catch class
      

      
    }
   

  catch(ArithmeticException e)
  {
    j=18/1;
    System.out.println("there is an arithmatic error" + e);
  }

  System.out.println(j);
  System.out.println("hey");

  }
}
