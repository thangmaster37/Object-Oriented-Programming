import java.util.Scanner;
public class Reverse
{
    public static int[] reverse(int[] array)
    {
        for (int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++)
        {
            System.out.print("Enter the number " + (i + 1) + " : ");
            array[i] = scan.nextInt();
        }
        scan.close();
        int[] reverse = reverse(array);
        System.out.print("The reverse is: ");
        for (int i = 0; i < number; i++)
        {
            System.out.print(reverse[i] + " ");
        }
    }
}
