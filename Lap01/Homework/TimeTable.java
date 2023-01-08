package homework;
import java.util.Scanner;
public class TimeTable 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = scan.nextInt();
		while (size < 0)
		{
			System.out.print("Enter the size: ");
			size = scan.nextInt();
		}
		System.out.printf(" * |");
		for (int i = 1; i <= size; i++)
		{
			System.out.printf("%4d", i);
		}
		
		System.out.println();
		System.out.print(" --");
		
		for (int i = 0; i <= size * 2; i++)
		{
			System.out.printf("%2s" , "--" );
		}
		
		System.out.println();
		
		for (int row = 1; row <= size; row++)
		{
			if (row != 10)
			{
				System.out.print(" " + row + " |");
			}
			else
			{
				System.out.print(row + " |");
			}
			for (int col = 1; col <= size; col++)
			{
				System.out.printf("%4d", row * col);
			}
			System.out.println();
		}
		scan.close();
	}

}
