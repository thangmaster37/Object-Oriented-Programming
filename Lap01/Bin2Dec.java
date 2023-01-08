package homework;
import java.util.Scanner;
public class Bin2Dec 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Binary string: ");
		String string = scan.nextLine();
		int length = string.length();
		int sum = 0;
		boolean check = true;
		for (int charInd = 0; charInd < length; charInd++)
		{
			
			
			if (string.charAt(charInd) != '1' && string.charAt(charInd) != '0')
			{
				check = false;
				break;
			}
			else if (string.charAt(charInd) == '1')
			{
				sum += Math.pow(2, (length - charInd - 1));
			}
			
			
		}
		if (check)
		{
			System.out.print("The equivalent decimal number for binary  \"" + string);
			System.out.println("\" is: " + sum);
		}
		else
		{
			System.out.print("error : invalid binary string \"" + string);
			System.out.println("\"");
		}
		scan.close();
	}

}
