import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class demo
{
  public static void main(String []args)
  {
    Set<Integer> obj= new TreeSet<Integer>();        //set cannot derive index number and doesnt allow duplicate numbers or objects
    
      obj.add(20);   
      obj.add(10);
      obj.add(53);
      obj.add(823);
      
      for (int k : obj)
      {
      System.out.println(k);
      }


      Set<String> obj1 =new HashSet<String>();
      obj1.add("shreyas");
      obj1.add("shreya");
      obj1.add("shrey");                            // Tree set allows incremental values in numbers
      obj1.add("shre");

      for(String n : obj1)
      {
      System.out.println(n);
      }

    
  }
}
