package homework4;
import  java.util.Scanner;
public class Factorial
{
    public static int factorial(int n)
    {
        if (n > 0)
        {
            return n * factorial(n - 1);
        }
        return 1;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        while (number < 0)
        {
            System.out.print("Enter the number again: ");
            number = scan.nextInt();
        }
        scan.close();
        System.out.println(factorial(number));
    }
}
