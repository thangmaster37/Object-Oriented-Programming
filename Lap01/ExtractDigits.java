import java.util.Scanner;

public class ExtractDigits 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n > 0)
		{
			int digit = n % 10;
			System.out.print(digit + "\t");
			n = n / 10;
		}
		scan.close();

	}

}
