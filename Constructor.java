class human
{
    private int age;
    private String name;

    public human()         //default constructor
    {
        age=22;
        name="shreyas";
    }

    

    public human(int a, String n) 
    {
        age=a;
        name=n;
    }



    public int getage()
    {
        return age;
    }

    public void setage(int a)
    {
        a=age;
    }

    public String getname()
    {
        return name;
    }
}

    class encapsulation
    {
        public static void main(String a [])
        {

            human obj =new human();
            human obj1 =new human(18,"shreyas");
            System.out.println(obj.getname()+":"+obj.getage());
            System.out.println(obj1.getname()+":"+obj1.getage());
        }

    }
