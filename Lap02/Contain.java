import java.util.Scanner;
public class Contain
{
    public static boolean contains(int[] array, int key)
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

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = scan.nextInt();
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++)
        {
            System.out.print("Enter the number " + (i + 1) + " : ");
            array[i] = scan.nextInt();
        }
        scan.close();

        if (contains(array, key))
        {
            System.out.print("TRUE");
        }
        else
        {
            System.out.print("FALSE");
        }
    }
}
