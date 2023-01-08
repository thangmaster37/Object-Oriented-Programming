package homework;
import java.util.Scanner;
public class TriangularPatternB 
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
		for (int row = 1; row <= size; row++)
		{
			for (int col = 1; col <= size - row + 1; col++)
			{
				System.out.print("# ");
			}
			System.out.println();
			
		}
		scan.close();
	}

}
