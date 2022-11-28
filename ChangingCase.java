import java.util.Scanner;
public class ChangingCase
{
	public static void main (String [] args)
	{
		int temp;
		Scanner sc = new Scanner(System.in);
		char x = sc.next().charAt (2);
		if (x >= 'a' && x <= 'z')
		{
			temp = (int) (x);
			x = (char )(temp-32);
	System.out.println (x);
		}
		
		else 
		{
			temp = (int) (x);
			x = (char )(temp+32);
			System.out.println (x);

		}
	}
}