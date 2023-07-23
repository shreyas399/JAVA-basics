@FunctionalInterface
interface A
{
  int add(int i, int j);
}

class demo
{
public static void main(String []args)
{
 A obj = (int i, int j)->
 {
  return i+j;
 };

}
}
