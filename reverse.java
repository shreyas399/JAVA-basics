import java.util.Scanner;
 class hello 
{

	public static void main(String[] args) 


	{
		int n,s=0,a;

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");

		n=sc.nextInt();

		while(n!=0)
		{
			a=n%10;
			s=s*10+a;
			n=n/10;
		}
		{
			System.out.println("the reverse of the number is"+" "+s);
		}

	}
	
}
