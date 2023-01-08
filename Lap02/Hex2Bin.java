import java.util.Scanner;
public class Hex2Bin
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String stringOrigin = scan.nextLine();
        String string = stringOrigin.toUpperCase();
        scan.close();
        String hexa = "0123456789ABCDEF";
        char[] hex = hexa.toCharArray();
        String[] HEX_BIN = {"0000", "0001", "0010", "0011", "0100", "0101", "0110",
                "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110","1111"};

        System.out.print("The equivalent binary for hexadecimal \"" + stringOrigin);
        System.out.print("\" is: ");

        for (int charInd = 0; charInd < string.length(); charInd++)
        {
            for (int ind = 0; ind < hex.length; ind++)
            {
                if (string.charAt(charInd) == hex[ind])
                {
                    System.out.print(HEX_BIN[ind] + " ");
                }
            }
        }
    }
}
