package homework;
import java.util.Scanner;
public class TestPalindromicWord 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String stringOrigin = scan.nextLine();
		String string = stringOrigin.toLowerCase();
		
		int length = string.length();
		int fIdx = 0;
		int bIdx = length - 1;
		boolean palindrome = true;
		
		while (fIdx < bIdx)
		{
			if (string.charAt(fIdx) != string.charAt(bIdx))
			{
				palindrome = false;
				break;
			}
			fIdx += 1;
			bIdx -= 1;
		}
		if (palindrome)
		{
			System.out.println(stringOrigin + " is a palindrome");
		}
		else
		{
			System.out.println(string + " is not a palindrome");
		}
		scan.close();
		
	}

}
