import java.util.Scanner;
public class Dec2Hex
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = scan.nextInt();
        while (number <= 0)
        {
            number = scan.nextInt();
        }
        scan.close();

        String hexa = "0123456789ABCDEF";
        char[] hex = hexa.toCharArray();
        String hexadecimal = "";
        System.out.print("The equivalent hexadecimal number is: ");

        while (number > 0)
        {
            int ind = number % 16;
            hexadecimal += Character.toString(hex[ind]);
            number = number / 16;
        }
        for (int i = 0; i < hexadecimal.length(); i++)
        {
            System.out.print(hexadecimal.charAt(hexadecimal.length() - (i + 1)));
        }
    }
}
