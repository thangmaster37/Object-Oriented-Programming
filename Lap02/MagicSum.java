import java.util.Scanner;
public class MagicSum
{
    public static boolean hasEight(int number)
    {
        while (number > 0)
        {
            int residual = number % 10;
            if (residual == 8)
            {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (true)
        {
            System.out.print("Enter a positive integer (or -1 to end): ");
            int number = scan.nextInt();
            if (number == -1)
            {
                break;
            }
            if (hasEight(number))
            {
                sum += number;
            }
        }
        System.out.print("The magic sum is: " + sum);
        scan.close();
    }
}
