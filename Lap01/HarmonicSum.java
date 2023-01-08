public class HarmonicSum 
{

	public static void main(String[] args) 
	{
		int n = 50000;
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		double absDiff;
		for (int i=1; i<=n; i++)
		{
			sumL2R += 1.0 * 1/i;
			sumR2L += 1.0 * 1/(n-i+1);
		}
		System.out.println("The sum from left−to−right is : " + sumL2R);
		
		System.out.println("The sum from right−to−left is : " + sumR2L);
		
		if (sumL2R > sumR2L)
		{
			absDiff = sumL2R - sumR2L;
		}
		else
		{
			absDiff = sumR2L - sumL2R;
		}
		System.out.println("Absolute Difference is : " + absDiff);
	}

}
