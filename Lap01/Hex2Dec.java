package homework;
import java.util.Scanner;
public class Hex2Dec 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Hexadecimal string: ");
		String stringOrigin = scan.nextLine();
		String string = stringOrigin.toUpperCase();
		int length = string.length();
		int sum = 0;
		int index = 0;
		boolean check = true;
		for (int charInd = 0; charInd < length; charInd++)
		{
			char elem = string.charAt(charInd);
			if (!((elem >= '0' && elem <= '9') || (elem >= 'A' && elem <= 'F')))
			{
				check = false;
				break;
			}
			switch (string.charAt(charInd))
			{
				case '0':
					index = 0;
					break;
				case '1':
					index = 1;
					break;
				case '2':
					index = 2;
					break;
				case '3':
					index = 3;
					break;
				case '4':
					index = 4;
					break;
				case '5':
					index = 5;
					break;
				case '6':
					index = 6;
					break;
				case '7':
					index = 7;
					break;
				case '8':
					index = 8;
					break;
				case '9':
					index = 9;
					break;
				case 'A':
					index = 10;
					break;
				case 'B':
					index = 11;
					break;
				case 'C':
					index = 12;
					break;
				case 'D':
					index = 13;
					break;
				case 'E':
					index = 14;
					break;
				case 'F':
					index = 15;
					break;
			}
			sum += index * Math.pow(16, (length - charInd - 1));
		}
		if (check)
		{
			System.out.print("The equivalent decimal number for hexadecimal \"" + stringOrigin);
			System.out.println("\" is: " + sum);
		}
		else
		{
			System.out.print("error : invalid hexadecimal string \"" + stringOrigin);
			System.out.println("\"");
		}
		scan.close();
	}

}
