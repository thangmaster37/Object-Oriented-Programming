package homework;
import java.util.Scanner;

public class HillPatternC 
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
		
		for (int row = 1; row <= 2 * size - 1; row++)
		{
			for (int col = 1; col <= 2 * size - 1; col++)
			{
				if (row <= 5)
				{
					if (col >= (size - row + 1) && col <= size + row - 1) 
					{
						System.out.print("# ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				else
				{
					if (col >= (row - size + 1) && col <= 2 * size - (row - size) - 1) 
					{
						System.out.print("# ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
			
		}
		scan.close();
	}

}
