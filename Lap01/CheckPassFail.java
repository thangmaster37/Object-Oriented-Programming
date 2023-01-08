import java.util.Scanner;

public class CheckPassFail 
{
    public static void main(String[] args)
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
            if (array[i] >= 50)
            {
            	System.out.println("The mark is " + array[i]);
                System.out.println("PASS");
            }
            else
            {
            	System.out.println("The mark is " + array[i]);
                System.out.println("FAIL");
            }
       	}
        System.out.println("DONE");
       	scan.close();
    }    
}