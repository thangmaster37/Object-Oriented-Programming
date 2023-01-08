package homework3;

public class FibonacciInt
{
    public static int fibonacci(int x, int y)
    {
            return x + y;
    }

    public static void main(String[] args)
    {
        int x = 1, y = 1;
        System.out.println("F(0) = " + 1);
        System.out.println("F(1) = " + 1);
        int count = 2;
        while (y <= Integer.MAX_VALUE - x)
        {
            System.out.println("F(" + count + ") = " + fibonacci(x, y));
            count += 1;
            int elem = x;
            x = y;
            y = fibonacci(elem, y);
        }
        System.out.println("F(" + count + ") is out the range of int");
    }
}
