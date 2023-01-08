import java.util.Scanner;
public class Search
{
    public static int search(int[] array, int key)
    {
        for (int ind = 0; ind < array.length; ind++)
        {
            if (array[ind] == key)
            {
                return ind;
            }
        }
        return -1;
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
        System.out.print(search(array, key));
    }
}
