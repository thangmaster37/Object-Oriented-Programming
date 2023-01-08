package homework3;

public class FactorialInt
{
    public static int factorial(int x)
    {
        int multiply = 1;
        for (int i = 1; i <= x; i++)
        {
            multiply *= i;
        }
        return multiply;
    }
    public static void main(String[] args)
    {
        int x = 0;
        while ((double) (Math.pow(2, 31) - 1) / factorial(x)  >= x + 1)
        {
            x += 1;
            System.out.println("The factorial of " + x + " is " + factorial(x));
        }
        System.out.println("The factorial of " + (x + 1) + " is out of range");
    }
}
