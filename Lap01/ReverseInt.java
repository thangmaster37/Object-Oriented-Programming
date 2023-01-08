import java.util.Scanner;

public class ReverseInt 
{
    public static void main(String[] args) 
    {
        int inNumber;
        int inDigit;
        int revNum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        inNumber = scan.nextInt();

        while (inNumber >0) 
        {
            inDigit = inNumber%10;
            revNum = revNum * 10 + inDigit;
            inNumber /= 10;
        }
        System.out.println("The reverse is : " + revNum);
        scan.close();
    }
}

