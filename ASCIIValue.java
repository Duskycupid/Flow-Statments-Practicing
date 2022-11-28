import java.util.Scanner;//Importing Package
public class ASCIIValue {//Defining class

	public static void main(String[] args) {//main method
Scanner sc = new Scanner (System.in);//creating object
{
	char x = sc.next().charAt(1);//Defining variable
	if (x >='a' && x <='z'|| x >= 'A'&& x <='Z')//flow statement
	{
		System.out.println ("Alphabet");
	}
	else if  (x>='0' && x<= '9')
	{
		System.out.println ("Number");

	}
	else
	{
		System.out.println ("Special Charcter");

	}
}
	}

}
