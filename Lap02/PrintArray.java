import java.util.Scanner;
public class PrintArray
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number on items: ");
        int NUM_ITEMS = scan.nextInt();
        while (NUM_ITEMS < 0)
        {
            NUM_ITEMS = scan.nextInt();
        }
        System.out.print("Enter the value of the all items (separated by space): ");
        int[] items = new int[NUM_ITEMS];

        for (int i = 0; i < items.length; i++)
        {
            items[i] = scan.nextInt();
        }
        scan.close();

        System.out.print("The values are: [");
        for (int i = 0; i < items.length; i++)
        {
            if (i == 0)
            {
                System.out.print(items[i]);
            }
            else
            {
                System.out.print(", " + items[i]);
            }
        }
        System.out.print("]");
    }
}
