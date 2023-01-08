package homework;
import java.util.Scanner;
public class CountVowelsDigits 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String string = scan.nextLine();
		string = string.toLowerCase();
		int length = string.length();
		int countDigit = 0;
		int countVowel = 0;
		
		for (int charInd = 0; charInd < length; charInd++)
		{
			if (string.charAt(charInd) >= '0' & string.charAt(charInd) <= '9')
			{
				countDigit += 1;
			}
			switch (string.charAt(charInd))
			{
				case 'a':
		        case 'e':		          
		        case 'i':		          
		        case 'o':		            
		        case 'u':
		        countVowel += 1;
			}
		}
		double percentageVowel = 1.0 * countVowel / length * 100;
		double percentageDigit = 1.0 * countDigit / length * 100;
		System.out.print("Number of vowels: " + countVowel);
		System.out.printf(" (%.2f", percentageVowel);
		System.out.print("%)");
		System.out.println();
		System.out.print("Number of digits: " + countDigit);
		System.out.printf(" (%.2f", percentageDigit);
		System.out.print("%)");
		scan.close();
	}

}
