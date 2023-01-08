package homework;
import java.util.Scanner;
public class CheckHexStr 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a hex string: ");
		String stringOrigin = scan.nextLine();
		String string = stringOrigin.toLowerCase();
		boolean hex = true;
		
		for (int charInd = 0; charInd < string.length(); charInd++)
		{
			char elem = string.charAt(charInd);
			if (!((elem >= '0' && elem <= '9')
					|| (elem >= 'a' && elem <= 'f')))
			{
				hex = false;
			}
			
		}
		if (hex)
		{
			System.out.println(stringOrigin + " is a hex string");
		}
		else
		{
			System.out.println(stringOrigin + " is NOT a hex string");
		}
		scan.close();
		
		
		

	}

}
