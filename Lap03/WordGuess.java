package homework3;
import java.util.Scanner;
public class WordGuess
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String stringGuess = args[0];
        char[] arrayGuess = stringGuess.toCharArray();
        char[] array = new char[arrayGuess.length];
        for (int i = 0; i < arrayGuess.length; i++)
        {
            array[i] = '_';
        }
        int count = 0;

        while (true)
        {
            int elem = 0;
            count += 1;
            System.out.print("Key in one character or your guess word: ");
            String guess = scan.nextLine();
            if (guess.length() > 1)
            {
                if (guess.equals(stringGuess))
                {
                    System.out.println("Congratulation!");
                    System.out.println("You got in " + count + " trials");
                    break;
                }
            }
            else
            {
                for (int charInd = 0; charInd < arrayGuess.length; charInd++)
                {
                    if (guess.equals(String.valueOf(arrayGuess[charInd])))
                    {
                        array[charInd] = guess.charAt(0);
                    }
                }

            }
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i]);
                if (array[i] == '_')
                {
                    elem += 1;
                }
            }
            System.out.println();
            if (elem == 0)
            {
                System.out.println("Congratulation!");
                System.out.println("You got in " + count + " trials");
                break;
            }
        }
        scan.close();
    }
}
