package homework4;
import java.util.Scanner;
public class NumberSequence
{
    public static int numofDigits(int n)
    {
        return String.valueOf(n).length();
    }
    public static int length(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else
        {
            return length(n - 1) + numofDigits(n);
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        while (number < 1)
        {
            System.out.print("Enter the number again: ");
            number = scan.nextInt();
        }
        scan.close();
        System.out.print(length(number));
    }
}
