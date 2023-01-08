package homework3;
import java.util.Scanner;
public class SpecialSeries
{
    public static double specialSeries(double x, int numTerms)
    {
        double sum = 0;
        for (int i = 1; i < numTerms ; i+=2)
        {
            double elem = 1;
            if (i != 1)
            {
                for (int k = 1; k < i - 1; k += 2)
                {
                    elem *= (double) k / (k + 1);
                }
                sum += (double) elem * Math.pow(x, i) / i;
            }
            else
            {
                sum += x;
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the x: ");
        double x = scan.nextDouble();
        System.out.print("Enter the numTerms: ");
        int numTerms = scan.nextInt();
        scan.close();
        System.out.println(specialSeries(x, numTerms));
    }
}
