package homework;
import java.util.Scanner;
public class PhoneKeyPad 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String string = scan.nextLine();
		string = string.toLowerCase();
		
		// use if-else
		for (int charInd = 0; charInd < string.length(); charInd++)
		{
			if (string.charAt(charInd) == 'a' || string.charAt(charInd) == 'b' || string.charAt(charInd) == 'c')
			{
				System.out.print("2");
			}
			else if (string.charAt(charInd) == 'd' || string.charAt(charInd) == 'e' || string.charAt(charInd) == 'f')
			{
				System.out.print("3");
			}
			else if (string.charAt(charInd) == 'g' || string.charAt(charInd) == 'h' || string.charAt(charInd) == 'i')
			{
				System.out.print("4");
			}
			else if (string.charAt(charInd) == 'j' || string.charAt(charInd) == 'k' || string.charAt(charInd) == 'l')
			{
				System.out.print("5");
			}
			else if (string.charAt(charInd) == 'm' || string.charAt(charInd) == 'n' || string.charAt(charInd) == 'o')
			{
				System.out.print("6");
			}
			else if (string.charAt(charInd) == 'p' || string.charAt(charInd) == 'q' || string.charAt(charInd) == 'r' || string.charAt(charInd) == 's')
			{
				System.out.print("7");
			}
			else if (string.charAt(charInd) == 't' || string.charAt(charInd) == 'u' || string.charAt(charInd) == 'v')
			{
				System.out.print("8");
			}
			else if (string.charAt(charInd) == 'w' || string.charAt(charInd) == 'x' || string.charAt(charInd) == 'y' || string.charAt(charInd) == 'z')
			{
				System.out.print("9");
			}
			else
			{
				System.out.print(string.charAt(charInd));
			}
		}
		
		System.out.println();
		
		// use switch-case
		for (int charInd = 0; charInd < string.length(); charInd++)
		{
			switch (string.charAt(charInd))
			{
				case 'a':
				case 'b':
				case 'c':
					System.out.print("2");
					break;
				case 'd':
				case 'e':
				case 'f':
					System.out.print("3");
					break;
				case 'g':
				case 'h':
				case 'i':
					System.out.print("4");
					break;
				case 'j':
				case 'k':
				case 'l':
					System.out.print("5");
					break;
				case 'm':
				case 'n':
				case 'o':
					System.out.print("6");
					break;
				case 'p':
				case 'q':
				case 'r':
				case 's':
					System.out.print("7");
					break;
				case 't':
				case 'u':
				case 'v':
					System.out.print("8");
					break;
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					System.out.print("9");
					break;
				default:
					System.out.print(string.charAt(charInd));
					
			}
		}
		
		scan.close();
	}

}
