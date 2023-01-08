package homework;
import java.util.Scanner;
public class SquarePattern 
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
		// use for-loops
		System.out.println("Use For - Loop");
		for (int row = 1; row <= size; row++)
		{
			for (int col = 1; col <= size; col++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
		
		// use while-do
		System.out.println("Use While - Loop");
		int row = size, col = size;
		while (row > 0)
		{
			row -= 1;
			while (col > 0)
			{
				System.out.print("# ");
				col -= 1;
			}
			col = size;
			System.out.println();
			
		}
		scan.close();

	}

}
