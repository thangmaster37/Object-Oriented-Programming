import java.util.Scanner;
public class Swap
{
    public static boolean swap(int[] array1, int[] array2)
    {
        if (array1.length == array2.length)
        {
            for (int i = 0; i < array1.length; i++)
            {
                int temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int number1 = scan.nextInt();
        System.out.print("Enter the number 2: ");
        int number2 = scan.nextInt();
        int[] array1 = new int[number1];
        int[] array2 = new int[number2];
        for (int i = 0; i < number1; i++) {
            System.out.print("Enter the number " + (i + 1) + " of the array1: ");
            array1[i] = scan.nextInt();
        }
        for (int i = 0; i < number2; i++) {
            System.out.print("Enter the number " + (i + 1) + " of the array2: ");
            array2[i] = scan.nextInt();
        }
        scan.close();

        if (swap(array1, array2))
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
}
