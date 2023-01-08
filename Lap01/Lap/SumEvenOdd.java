public class SumEvenOdd 
{

	public static void main(String[] args)
	{
		int sumEven = 0;
		int sumOdd = 0;
		int absDiff;
		for (int i=1; i<=100; i++)
		{
			if (i % 2 == 0)
			{
				sumEven += i;
			}
			else
			{
				sumOdd += i;
			}
		}
		System.out.println("Sum Even is " + sumEven);
		System.out.println("Sum Odd is " + sumOdd);
		
		if (sumEven > sumOdd)
		{
			absDiff = sumEven - sumOdd;
		}
		else
		{
			absDiff = sumOdd - sumEven;
		}
		System.out.println("Absolute difference is " + absDiff);
	}
		
}
