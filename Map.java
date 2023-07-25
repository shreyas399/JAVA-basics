
import java.util.HashMap;

import java.util.Map;


class demo
{
  public static void main(String []args)
  {
  

      Map<String, Integer> obj2 =new HashMap<>();     // Map doesnot allow duplicate values instead it replace with newer one
      obj2.put("SHREYAS", 99);
      obj2.put("Sushma",50);
      obj2.put("sukanya", 80);
      obj2.put("SHREYAS", 100);

      for(String key: obj2.keySet())
      {
        System.out.println(key+":"+obj2.get(key));
      }
    
  }
}
