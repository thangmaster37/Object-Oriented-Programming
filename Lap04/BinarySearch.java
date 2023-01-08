package homework4;
import java.util.Scanner;
public class BinarySearch
{
    public static int[] array(int number, Scanner scan)
    {
        int[] array = new int[number];
        for (int i = 0; i < number; i++)
        {
            System.out.print("Enter the number " + (i + 1) + " : ");
            array[i] = scan.nextInt();
        }
        return arraySort(array);
    }
    public static int[] arraySort(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int k = i; k < array.length; k++)
            {
                if (array[i] > array[k])
                {
                    int elem = array[i];
                    array[i] = array[k];
                    array[k] = elem;
                }
            }
        }
        return array;
    }
    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx)
    {
        if (fromIdx == toIdx - 1)
        {
            if (key == array[fromIdx])
            {
                return true;
            }
            return false;
        }
        else
        {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (array[middleIdx] == key)
            {
                return true;
            }
            else if (key < array[middleIdx])
            {
                toIdx = middleIdx;
            }
            else
            {
                fromIdx = middleIdx + 1;
            }
            binarySearch(array, key, fromIdx, toIdx);
        }
        return false;
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
        if (binarySearch(array, key, 0, array.length - 1))
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}
