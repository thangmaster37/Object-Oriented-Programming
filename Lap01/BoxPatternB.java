package homework;
import java.util.Scanner;
public class BoxPatternB
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
		
		for (int row = 1; row < size; row++)
		{
			for (int col = 1; col < size; col++)
			{
				if (row == 1 | row == size - 1)
				{
					System.out.print("# ");
				}
				else
				{
					if (col == row)
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
