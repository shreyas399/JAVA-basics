class human
{
    private int age;
    private String name;

    public int getage()
    {
        return age;
    }

    public String getname()
    {
        return name;
    }

    public void setname(String n)
    {
        name=n;
    }

    public void setage(int a)
    {
        age=a;
    }
}

class encapsulation
{
    public static void main(String a[])
    {
        human obj=new human();
        obj.setage(22);
        obj.setname("shreyas gowda");

        System.out.println(obj.getage()+" : "+obj.getname());
    }
}
