package homework4;
import java.util.Scanner;
public class GCD
{
    public static int gdc(int a, int b)
    {
        while (b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int a = scan.nextInt();
        System.out.print("Enter the number 2: ");
        int b = scan.nextInt();
        scan.close();
        System.out.print(gdc(a, b));
    }
}
