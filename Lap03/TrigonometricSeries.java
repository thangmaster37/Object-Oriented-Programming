package homework3;
import java.util.Scanner;
public class TrigonometricSeries
{
    public static double sin(double x, int numTerms)
    {
        double sin = 0;
        int count = 0;
        for (int i = 1; i < numTerms; i+=2)
        {
            count += 1;
            double elem = 1;
            for (int k = 0; k < i; k++)
            {
                elem *= x / (i - k);
            }
            sin += (double) elem * Math.pow(-1, count + 1);
        }
        return sin;
    }

    public static double cos(double x, int numTerms)
    {
        double cos = 0;
        int count = 0;
        for (int i = 0; i < numTerms; i+=2)
        {
            count += 1;
            double elem = 1;
            for (int k = 0; k < i; k++)
            {
                elem *= x / (i - k);
            }
            cos += (double) elem * Math.pow(-1, count + 1);
        }
        return cos;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the x: ");
        double x = scan.nextDouble();
        System.out.print("Enter the numIterms: ");
        int numTerm = scan.nextInt();
        scan.close();

        double sin = sin(x, numTerm);
        double cos = cos(x, numTerm);

        System.out.println("Sin(" + x + ") is: " + sin);
        System.out.println("Cos(" + x + ") is: " + cos);

        if (sin > Math.sin(x))
        {
            System.out.println("sin(" + x + ") is calculated to be greater than using the function");
        }
        else
        {
            System.out.println("sin(" + x + ") is calculated to be less than using the function");
        }

        if (cos > Math.cos(x))
        {
            System.out.println("cos(" + x + ") is calculated to be greater than using the function");
        }
        else
        {
            System.out.println("cos(" + x + ") is calculated to be less than using the function");
        }
    }

}
