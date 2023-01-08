public class Fibonacci 
{
	public static void main(String[] args)
	{
		int n = 20;
		int[] arrayFibonacci = new int[n];
		arrayFibonacci[0] = 1;
		arrayFibonacci[1] = 1;
		double sum = 0;
		for (int i=0; i<n; i++)
		{
			if (i<=1)
			{
				System.out.print(arrayFibonacci[i] + "\t");
				sum += arrayFibonacci[i];
			}
			else
			{
				arrayFibonacci[i] = arrayFibonacci[i-1] + arrayFibonacci[i-2];
				sum += arrayFibonacci[i];
				System.out.print(arrayFibonacci[i] + "\t");
			}
		}
		System.out.println("");
		double average = (double) sum/n;
		System.out.println("Average is " + average);
	}
}
