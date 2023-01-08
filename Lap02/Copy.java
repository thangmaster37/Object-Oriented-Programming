import java.util.Scanner;
public class Copy
{
    public static int[] copyOf(int[] array)
    {
            int[] arrayCopy = new int[array.length];
            for (int i = 0; i < array.length; i++)
            {
                arrayCopy[i] = array[i];
            }
            return arrayCopy;
    }

    public static int[] copyOf(int[] array, int newLength)
    {
        int[] arrayCopy = new int[newLength];
        for (int i = 0; i < arrayCopy.length; i++)
        {
            arrayCopy[i] = array[i];
        }
        return arrayCopy;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        int[] array = new int[number];
        System.out.print("Enter the new length: ");
        int newLength = scan.nextInt();
        while (newLength > number)
        {
            System.out.print("Enter the new length: ");
            newLength = scan.nextInt();
        }
        for (int i = 0; i < number; i++)
        {
            System.out.print("Enter the element " + (i + 1) + " :");
            array[i] = scan.nextInt();
        }
        scan.close();
        int[] arrayCopy1 = copyOf(array);
        int[] arrayCopy2 = copyOf(array, newLength);

        for (int i = 0; i < arrayCopy1.length; i++)
        {
            System.out.print(arrayCopy1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayCopy2.length; i++)
        {
            System.out.print(arrayCopy2[i] + " ");
        }
    }
}
