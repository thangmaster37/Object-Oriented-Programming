package homework4;
import java.util.Scanner;
public class LinearSearch
{
    public static int[] array(int number, Scanner scan)
    {
        int[] array = new int[number];
        for (int i = 0; i < number; i++)
        {
            System.out.print("Enter the number " + (i + 1) + " : ");
            array[i] = scan.nextInt();
        }
        return array;
    }
    public static boolean linearSearch(int[] array, int key)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (key == array[i])
            {
                return true;
            }
        }
        return false;
    }
    public static int linearSearchIndex(int[] array, int key)
    {
        if (linearSearch(array, key))
        {
            for (int i = 0; i < array.length; i++)
            {
                if (key == array[i])
                {
                    return i;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = scan.nextInt();
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        int[] array = array(number, scan);
        scan.close();
        System.out.print(linearSearchIndex(array, key));
    }
}

