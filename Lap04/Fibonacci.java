package homework4;
import java.util.Scanner;
public class Fibonacci
{
    public static int fibonacci(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
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
        for (int i = 0; i < number + 1; i++)
        {
            System.out.println("F(" + i + ") = " + fibonacci(i));
        }
    }
}
