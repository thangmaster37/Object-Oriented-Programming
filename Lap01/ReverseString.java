package homework;
import java.util.Scanner;
public class ReverseString 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String string = scan.nextLine();
		System.out.print("The reverse of the String is: ");
		for (int charInd = 0; charInd < string.length(); charInd++)
		{
			System.out.print(string.charAt(string.length() - charInd - 1));
		}
		scan.close();
	}

}
