package homework;
import java.util.Scanner;
public class Oct2Dec 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an Octal string: ");
		String string = scan.nextLine();
		int length = string.length();
		int sum = 0;
		int value = 0;
		
		for (int charInd = 0; charInd < length; charInd++)
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
		System.out.print("The equivalent decimal number \"" + string);
		System.out.println("\" is: " + sum);
		scan.close();
	}

}
