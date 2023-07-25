import java.util.ArrayList;
import java.util.Collection;

class demo
{
  public static void main(String[]args)
  {
    Collection<Integer> obj=new ArrayList<Integer>();   // Collection can be used when index number is not necessary, if required use List
    obj.add(220);
    obj.add(50);
    obj.add(10);
    obj.add(40);

    for(int n : obj)
    {
      System.out.println(n);
    }

    // int nums[]=new int[5];
    // nums[0]=20;
    // nums[1]=40;
    // nums[2]=49;                         d/f b/w Array and array linked list
    // nums[3]=25;
    // nums[4]=63;
    //  nums[5]=256;
    //  nums[6]=202;

    // for(int k : nums)
    // {
    //   System.out.println(k);
    // }
  }
}
