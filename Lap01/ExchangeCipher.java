package homework;
import java.util.Scanner;
public class ExchangeCipher 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a plaintext string: ");
		String string = scan.nextLine().toUpperCase();
		System.out.print("The ciphertext string is: ");
		for (int charInd = 0; charInd < string.length(); charInd++)
		{
			int elem = (char) ('A') + (char) ('Z') - (char) (string.charAt(charInd));
			System.out.print((char) (elem));
		}
		scan.close();

	}

}
