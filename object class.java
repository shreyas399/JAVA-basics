class Laptop
{
    int price;
    String model;

    public String toString()
        {
            return model + ":"+ price;
        }

    public Boolean equals( Laptop that)
    {
        if (this.model.equals(that.model) && this.price == that.price)   //object class  // to overcome the hashcode problems
            return true;
        else 
            return false;  
    }
    
}

class demo
{
    public static void main(String []args)
    {
        Laptop obj =new Laptop();
        obj.price=1000;
        obj.model="lenovo v4";

        Laptop obj1 = new Laptop();
        obj1.price=1000;
        obj1.model="lenovo v45";

        boolean result=obj.equals(obj1);

        System.out.println(result);
    }
}
