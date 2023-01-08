package homework;
import java.util.Scanner;
public class CaesarCode 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a plaintext string: ");
		String string = scan.nextLine().toUpperCase();
		System.out.print("The ciphertext string is: ");
		for (int charInd = 0; charInd < string.length(); charInd++)
		{
			if (string.charAt(charInd) != 'X' && string.charAt(charInd) != 'Y' && string.charAt(charInd) != 'Z')
			{
				System.out.print((char)(string.charAt(charInd) + 3));
			}
			else
			{
				if (string.charAt(charInd) == 'X')
					System.out.print("A");
				else if (string.charAt(charInd) == 'Y')
					System.out.print("B");
				else
				{
					System.out.print("C");
				}
			}
		}
		scan.close();
	}

}
