class human
{
    private int age=22;
    private String name="shreyas";

    public int getage()
{
    return age;
}

    public String getname()
    {
        return name;
    }

}



public class encapsulation 
{
   public static void main(String a[])
   {
    human obj=new human();
    System.out.println(obj.getname()+ " : "+obj.getage());
   } 
}
