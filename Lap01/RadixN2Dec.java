package homework;
import java.util.Scanner;
public class RadixN2Dec 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radix: ");
		int radix = Integer.parseInt(scan.nextLine());
		System.out.print("Enter the string: ");
		String stringOrigin = scan.nextLine();
		String string = stringOrigin.toUpperCase();
		int length = string.length();
		int sum = 0;
		int value = 0;
		int index = 0;
		boolean check = true;
		
		for (int charInd = 0; charInd < length; charInd++)
		{
			if (radix == 2)
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
			else if (radix == 8)
			{
				switch (string.charAt(charInd))
				{
					case '0':
						value = 0;
						break;
					case '1':
						value = 1;
						break;
					case '2':
						value = 2;
						break;
					case '3':
						value = 3;
						break;
					case '4':
						value = 4;
						break;
					case '5':
						value = 5;
						break;
					case '6':
						value = 6;
						break;
					case '7':
						value = 7;
						break;
					case '8':
						value = 8;
						break;
					case '9':
						value = 9;
						break;
				}
				sum += value * Math.pow(8, (length - charInd - 1));
			}
			else if (radix == 10)
			{
				sum = Integer.parseInt(stringOrigin);
			}
			else if (radix == 16)
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
			
		}
		if (check == true && radix == 2)
		{
			{
				System.out.print("The equivalent decimal number for binary  \"" + string);
				System.out.println("\" is: " + sum);
			}
		}
		else if (check == false && radix == 2)
		{
			System.out.print("error : invalid binary string \"" + string);
			System.out.println("\"");
		}
		else if (radix == 8)
		{
			System.out.print("The equivalent decimal number \"" + string);
			System.out.println("\" is: " + sum);
		}
		else if (radix == 10)
		{
			System.out.print("The equivalent decimal number for decimal \"" + string);
			System.out.println("\" is: " + sum);
		}
		else if (check == true && radix == 16)
		{
			System.out.print("The equivalent decimal number for hexadecimal \"" + stringOrigin);
			System.out.println("\" is: " + sum);
		}
		else if (check == false && radix == 16)
		{
			System.out.print("error : invalid hexadecimal string \"" + stringOrigin);
			System.out.println("\"");
		}
		scan.close();
	}

}
