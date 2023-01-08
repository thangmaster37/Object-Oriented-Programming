package homework4;
import java.util.Arrays;
import java.util.Scanner;
public class Sort
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
    public static int[] selectionSort(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int min_ind = i;
            for (int k = i; k < array.length; k++)
            {
                if (array[k] < array[i])
                {
                    min_ind = k;
                }
            }
            int temp = array[i];
            array[i] = array[min_ind];
            array[min_ind] = temp;
        }
        return array;
    }

    public static int[] bubbleSort(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int k = 0; k < array.length - 1; k++)
            {
                if (array[k] > array[k + 1])
                {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] inserttionSort(int[] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key)
            {
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    public static void print(int[] array)
    {
        System.out.print(Arrays.toString(array));
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        int[] array = array(number, scan);
        scan.close();
        int[] selection = selectionSort(array);
        int[] bubble = bubbleSort(array);
        int[] insertion = inserttionSort(array);
        System.out.println("Selection sort:");
        print(selection);
        System.out.println("Bubble sort:");
        print(bubble);
        System.out.println("Insertion sort:");
        print(insertion);
    }
}
