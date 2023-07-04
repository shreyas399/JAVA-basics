class Calcu
{
public int add(int n1, int n2)
{
    return (n1+n2);

}   


public int sub(int m1 ,int m2)
{
    return (m1-m2);
}
}


class adv extends Calcu
{
    public int multi(int n1 , int n2)
    {
        return (n1*n2);
    }

    public int div(int n1 , int n2)
    {
        return (n1/n2);
    }
}

class Veryadv extends adv
{
    public double power(double n1 , double n2)
    {
        return Math.pow(n1, n2);
    }
}


class demo
{
    public static void main(String []args)
    {
       Veryadv obj = new Veryadv();
       int r1= obj.add(20, 50);
       int r2 =obj.sub(20,15);
       int r3 =obj.multi(20,15);
       int r4 =obj.div(20,15);
       double r5 =obj.power(1 , 2);
       

        System.out.println(r1+":"+r2+":"+r3+":"+r4+":"+r5);
    }

}
