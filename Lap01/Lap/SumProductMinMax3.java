import java.util.Scanner;
public class SumProductMinMax3 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		for (int i=0; i<n; i++)
		{
			array[i] = scan.nextInt();
		}
		int min = array[0];
		int max = array[0];
		int sum = 0;
		int prod = 1;
		for (int i=0; i<n; i++)
		{
			sum += array[i];
			prod *= array[i];
			if (array[i] < min)
			{
				min = array[i];
			}
			if (array[i] > max)
			{
				max = array[i];
			}
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " + prod);
		System.out.println("The min is: " + min);
		System.out.println("The max is: " + max);
		scan.close();
	}

}
