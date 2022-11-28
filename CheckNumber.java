import java.util.*;
public class CheckNumber {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int flag =0,i = 0;
int n ;
System.out.println ("Enter the number of elements of an array:");
n = sc.nextInt();
int x;
System.out.println ("Enter the element chek if it is present in the array:");
x = sc.nextInt();
System.out.println ("Enter the elements of an array:");
int [] array = new int [n];
for (i=0;i<n;i++)
{
	array [i] = sc.nextInt ();
	
	}
for (i=0;i<n;i++)
{
	if (array [i] == x)
	{
		flag = 1;
		break;
	}
}
if (flag ==1)
{
	System.out.println (x +" is at " + (i+1+ "rd position."));

}
else 
{
	System.out.println ("-1");

}
	}

}
