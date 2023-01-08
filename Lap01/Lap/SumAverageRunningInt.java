public class SumAverageRunningInt 
{
	
	public static void main(String[] args) 
	{
		// 1-100
		int sum = 0;
		final int LOWERBOUND = 1 ;
		final int UPPERBOUND = 100;
		for (int i=LOWERBOUND; i<=UPPERBOUND; i++)
		{
			sum += i;
		}
		System.out.println("Sum is " + sum);
		double average = (double) sum/UPPERBOUND;
		System.out.println("Average is " + average);
		
		// 111-8899
		int tong = 0;
		int count = 0;
		for (int i=111; i<=8899; i++)
		{
			tong += i;
			count += 1;
		}
		System.out.println("Sum is " + tong);
		double mean = (double) tong/count;
		System.out.println("Mean is " + mean);

	}

}
