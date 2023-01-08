public class ComputePI 
{

	public static void main(String[] args) 
	{
		double sum = 0.0;
		int MAX_DENOMINATOR = 1000;
		for (int i=1; i<=MAX_DENOMINATOR; i++)
		{
			if (i % 4 == 1)
			{
				sum += 1.0 * 1/i;
			}
			else if (i % 4 == 3)
			{
				sum -= 1.0 * 1/i;
			}
		
		}
		double pi = (double) 4 * sum;
		System.out.println("Pi is " + pi);
		System.out.println("Impossible!!!");
	}

}
