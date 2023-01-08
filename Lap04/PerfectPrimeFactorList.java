package homework4;
import java.util.Scanner;
public class PerfectPrimeFactorList
{
    public static boolean isProductOfPrimeFactors(int aPosInt)
    {
        int multiply = 1;
        for (int i = 2; i <= aPosInt / 2; i++)
        {
            if (aPosInt % i == 0 && PrimeList.isPrime(i))
            {
                multiply *= i;
            }
        }
        return multiply == aPosInt;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upper = scan.nextInt();
        scan.close();
        int count = 0;
        System.out.println("These numbers are equal to the product of prime factors:");
        for (int i = 2; i <= upper; i++)
        {
            if (isProductOfPrimeFactors(i))
            {
                System.out.print(i + " ");
                count += 1;
            }
        }
        System.out.println();
        double percentage = 100.0 * count / upper;
        System.out.printf("[" + count + " numbers found (%.2f", percentage);
        System.out.print(")]");

    }
}
