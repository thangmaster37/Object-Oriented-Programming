import java.util.Scanner;
public class Print
{
    public static void print(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (i == 0)
            {
                System.out.print("[" + array[i]);
            }
            else
            {
                System.out.print(", " + array[i]);
            }
        }
        System.out.print("]");

    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter the element " + i + ": ");
            array[i] = scan.nextInt();
        }
        scan.close();
        print(array);
    }
}
