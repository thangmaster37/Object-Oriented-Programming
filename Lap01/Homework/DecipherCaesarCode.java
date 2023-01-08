package homework;

import java.util.Scanner;

public class DecipherCaesarCode 
{

	public static void main(String[] args) 
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a ciphertext string: ");
		String string = scan.nextLine().toUpperCase();
		System.out.print("The plaintext string is: ");
		for (int charInd = 0; charInd < string.length(); charInd++)
		{
			if (string.charAt(charInd) != 'A' && string.charAt(charInd) != 'B' && string.charAt(charInd) != 'C')
			{
				System.out.print((char)(string.charAt(charInd) - 3));
			}
			else
			{
				if (string.charAt(charInd) == 'A')
					System.out.print("X");
				else if (string.charAt(charInd) == 'B')
					System.out.print("Y");
				else
				{
					System.out.print("Z");
				}
			}
		}
		scan.close();
	}

}
