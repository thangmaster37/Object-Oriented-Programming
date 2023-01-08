import java.util.Scanner;

public class CheckOddEven 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int[n];
        for (int i=0; i<array.length; i++)
        {
            array[i] = scan.nextInt();
        }
        for (int i=0; i<array.length; i++)
        {
            if (array[i] % 2 == 0)
            {
            	System.out.println("The marker is " + array[i]);
                System.out.println("Even Number");
            }
            else
            {
            	System.out.println("The marker is " + array[i]);
                System.out.println("Odd Number");
            }
        }
        System.out.println("Bye!");
        scan.close();
    }    
}
