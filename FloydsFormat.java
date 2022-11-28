import java.util.Scanner;
public class FloydsFormat 
{
	public static void main(String[] args) 
	{
Scanner scan = new Scanner (System.in);
int n = scan.nextInt ();
if (args.length==0)
{
	 System.out.println ("Enter the Value");

}
for (int i = 0; i<=n;i++)
{
	for (int j=0;j<=i;j++)
	{
		 System.out.print("*");

	}
	 System.out.println (" ");

}
	}

}
