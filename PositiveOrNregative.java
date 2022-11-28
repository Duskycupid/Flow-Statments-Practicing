import java.util.Scanner;
public class PositiveOrNregative {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int x = sc.nextInt();
if (x ==0)
{
	System.out.println ("The user entered zero");
}
else if (x>0)
{
	System.out.println ("The user entered a positive number");

}
else 
{
	System.out.println ("The user entered a neagtive number");

}
	}

}
