import java.util.Scanner;
public class Exponent
{
    public static int exponent(int base, int exp)
    {
        int power = 1;
        for (int i = 0; i < exp; i++)
        {
            power *= 3;
        }
        return power;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scan.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scan.nextInt();
        scan.close();
        System.out.println(base + " raises to the power of " + exponent + " is: " + exponent(base, exponent));
    }
}
