package homework4;
import java.util.Scanner;
public class GreatestCommonDivisor
{
    public static int gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        else if (b > 0)
        {
            return gcd(b, a%b);
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int number1 = scan.nextInt();
        System.out.print("Enter the number2: ");
        int number2 = scan.nextInt();
        scan.close();
        if (gcd(number1, number2) != 0)
        {
            System.out.print(gcd(number1, number2));
        }
        else
        {
            System.out.print("No Greatest Common Divisor");
        }
    }
}
