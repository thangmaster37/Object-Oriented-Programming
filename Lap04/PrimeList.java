package homework4;
import java.util.Scanner;
public class PrimeList
{
    public static boolean isPrime(int aPosInt)
    {
        if (aPosInt < 1)
        {
            return false;
        }
        for (int i = 2; i < aPosInt; i++)
        {
            if (aPosInt % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int upper = scan.nextInt();
        scan.close();
        int count = 0;
        for (int i = 0; i <= upper; i++)
        {
            if (isPrime(i))
            {
                System.out.println(i);
                count += 1;
            }
        }
        double percentage = 100.0 * count / upper ;
        System.out.printf(count + " primes found (%.2f",percentage);
        System.out.print(")]");
    }
}
