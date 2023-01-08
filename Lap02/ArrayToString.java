import java.util.Scanner;
public class ArrayToString
{
    public static String arrayToString(int[] array)
    {
        String string = "[";
        for (int i = 0; i < array.length; i++)
        {
            if (i == 0)
            {
                string += String.valueOf(array[i]);
            }
            else
            {
                string += ", " + String.valueOf(array[i]);
            }
        }
        string += "]";
        return string;
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

        System.out.print(arrayToString(array));
    }
}
