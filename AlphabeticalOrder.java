import java .util.Scanner;// Importing packages
public class AlphabeticalOrder//Defining class
{
	public static void main (String args [])//main method
	{
		Scanner scan = new Scanner (System.in);//Creating object
		char x = scan.next().charAt(0);//Defining  variable of x variable
		char y= scan.next().charAt(0);//Defining variable of y variable
if (x<y) // Flow statement
{
	System.out.println (x+ ","+y);
}
else 
{
	System.out.println (y+ ","+x);

}
	}
}