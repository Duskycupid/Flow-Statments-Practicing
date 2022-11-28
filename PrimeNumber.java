import java.util.Scanner;
public class PrimeNumber 
{
public static void main (String [] args)
{
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	if (args. length ==0)
	{
		System.out.println ("Enter an Integer  Number");
	}
	else if (n==0 || n ==1)
	{
		System.out.println (n+ "is neither a composite number");

	}
	else
	{
		int flag = 0;
		for (int i =2;i<n;i++)
		{
			if (n%i==0)
			{
				flag =1;
						break;
			}
		}
		if (flag==0)
		{
			System.out.println (n+ "is a prime number")	;

		}
		else
		{
			System.out.println (n+ "is not a prime number")	;

		}
	}
}
}
