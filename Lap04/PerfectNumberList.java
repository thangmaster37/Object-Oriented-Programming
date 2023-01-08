package homework4;
import java.util.Scanner;
public class PerfectNumberList
{
    public static int properDivisor(int aPosint)
    {
        int sum = 0;
        for (int i = 1; i < aPosint / 2 + 1; i++)
        {
            if (aPosint % i == 0)
            {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int aPosInt)
    {
        if (properDivisor(aPosInt) == aPosInt)
        {
            return true;
        }
        return false;
    }

    public static boolean isDeficient(int aPosInt)
    {
        if (properDivisor(aPosInt) < aPosInt)
        {
            return true;
        }
        return false;
    }

    public static void printPerfect(int upper)
    {
        int number = 1;
        while (number <= upper)
        {
            if (isPerfect(number))
            {
                System.out.print(number + " ");
            }
            number += 1;
        }
    }

    public static void printDeficient(int upper)
    {
        int number = 1;
        while (number <= upper)
        {
            if ((!isDeficient(number)) && (!isPerfect(number)))
            {
                System.out.print(number + " ");
            }
            number += 1;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upper = scan.nextInt();
        scan.close();
        System.out.println("These numbers are perfect: ");
        printPerfect(upper);
        System.out.println();
        System.out.println("These numbers are neither deficient nor perfect: ");
        printDeficient(upper);
    }
}
