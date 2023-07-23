enum demo
{
  dell(1500),hp(2000);
  private int price;

  private demo(int price)
  {
    this.price=price;
  }

  public int getprice()
  {
    return price;
  }
  public int setprice()
  {
    return price;
  }
}
class demoe
{
public static void main(String []args)
 {
//   demo obj=demo.dell;
//   System.out.println(obj+"="+obj.getprice());
for( demo obj: demo.values())
{
  System.out.println(obj +" = "+obj.getprice());
}
 }

}
