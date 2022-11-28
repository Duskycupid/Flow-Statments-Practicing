import java.util.Scanner;
public class ColorCode 
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		 System.out.println ("Enter the code");
char a = sc.next().charAt(0);
switch (a)
{
case 'R':
{
	 System.out.println ("Red");
	 break;
}
case  'B':
{
	 System.out.println ("Blue");
	 break;

}
case 'O':{
	 System.out.println ("Orange");
break;
}
default:


{
	 System.out.println ("Invalid code");
break;
}}
}
}
