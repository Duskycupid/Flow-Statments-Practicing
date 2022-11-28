import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int num = sc.nextInt ();
int t = 0;
while (num!=0)
{
	t = num%10;
	System.out.print (t);
num = num/10;
}
	}

}
