package homework3;
import java.util.Scanner;
public class NumberGuess
{
    public static void main(String[] args)
    {
        final int random = (int) (Math.random() * 100);
        Scanner scan = new Scanner(System.in);
        System.out.println("Key in your guess: ");
        int numGuess = scan.nextInt();
        int count = 1;
        if (numGuess == random)
        {
            System.out.println("You got it in " + count + " trials");
        }
        else if (numGuess > random)
        {
            System.out.println("Try lower");
        }
        else
        {
            System.out.println("Try higher");
        }

        while (numGuess != random)
        {
            count += 1;
            numGuess = scan.nextInt();
            if (numGuess == random)
            {
                System.out.println("You got it in " + count + " trials");
                break;
            }
            else if (numGuess > random)
            {
                System.out.println("Try lower");
            }
            else
            {
                System.out.println("Try higher");
            }
        }
        scan.close();

    }
}
