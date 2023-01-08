import java.util.Scanner;
public class PrintArrayInStars
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
            while (items[i] < 0)
            {
                items[i] = scan.nextInt();
            }
        }
        scan.close();

        for (int i = 0; i < items.length; i++)
        {
           System.out.print(i + ": ");
           for (int star = 0; star < items[i]; star++)
           {
               System.out.print("*");
           }
            System.out.println("(" + items[i] + ")");
        }
    }
}

