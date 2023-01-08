package homework3;
import java.util.Scanner;
public class NumberConversion
{
    public static boolean isBinary(String string)
    {
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) != '0' && string.charAt(i) != '1')
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isOctal(String string)
    {
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) < '0' || string.charAt(i) > '7')
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecimal(String string)
    {
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) < '0' || string.charAt(i) > '9')
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isHexaDecimal(String string)
    {
        for (int i = 0; i < string.length(); i++)
        {
            char elem = string.charAt(i);
            if (!((elem >= '0' && elem <= '9') || (elem >= 'A' && elem <= 'F')))
            {
                return false;
            }
        }
        return true;
    }

    public static String bin2Bin(String string)
    {
        return string;
    }
    public static String bin2Oct(String string)
    {
        int length = string.length();
        if (length % 3 != 0)
        {
            for (int i = 0; i < 3 - length % 3; i++)
            {
                string = "0" + string;
            }
        }
        String transform2To8 = "";
        for (int charInt = 0 ; charInt <= string.length() - 3; charInt += 3)
        {
            String substring = string.substring(charInt, charInt + 3);
            transform2To8 += bin2Dec(substring);
        }
        return transform2To8;
    }
    public static String bin2Dec(String string)
    {
        String transform2To10 = "";
        int sum = 0;
        for (int charInd = 0; charInd < string.length(); charInd++)
        {
            if (string.charAt(charInd) == '1')
            {
                sum += (int) Math.pow(2, (string.length() - charInd - 1));
            }
        }
        return transform2To10 + String.valueOf(sum);
    }
    public static String bin2Hex(String string)
    {
        int length = string.length();
        if (length % 4 != 0)
        {
            for (int i = 0; i < 4 - length % 4; i++)
            {
                string = "0" + string;
            }
        }
        String transform2To16 = "";
        String[] array1 = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        String x = "0123456789ABCDEF";
        char[] array2 = x.toCharArray();
        for (int charInt = 0 ; charInt <= string.length() - 4; charInt += 4)
        {
            String substring = string.substring(charInt, charInt + 4);
            for (int i = 0; i < array1.length; i++)
            {
                if (substring.equals(array1[i]))
                {
                    transform2To16 += array2[i];
                }
            }

        }
        return transform2To16;
    }

    public static String oct2Bin(String string)
    {
        String transform8To2 = "";
        String[] array1 = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String x = "01234567";
        char[] array2 = x.toCharArray();
        for (int i = 0; i < string.length(); i++)
        {
            for (int k = 0; k < array2.length; k++)
            {
                if (string.charAt(i) == array2[k])
                {
                    transform8To2 += array1[k];
                }
            }
        }
        return transform8To2;
    }
    public static String oct2Oct(String string)
    {
        return string;
    }
    public static String oct2Dec(String string)
    {
        String stringBin = oct2Bin(string);
        return bin2Dec(stringBin);
    }
    public static String oct2Hex(String string)
    {
        String bin = oct2Bin(string);
        return bin2Hex(bin);
    }

    public static String dex2Bin(String string)
    {
        String transform10To2 = "";
        int decimal = Integer.parseInt(string);
        while (decimal > 0)
        {
            int remainder = decimal % 2;
            decimal = decimal / 2;
            transform10To2 = String.valueOf(remainder) + transform10To2;
        }
        return transform10To2;
    }
    public static String dec2Oct(String string)
    {
        String stringBin = dex2Bin(string);
        return bin2Oct(stringBin);
    }
    public static String dec2Dec(String string)
    {
        return string;
    }
    public static String dec2Hex(String string)
    {
        String stringBin = dex2Bin(string);
        return bin2Hex(stringBin);
    }

    public static String hex2Bin(String string)
    {
        String transform16To2 = "";
        String hexa = "0123456789ABCDEF";
        char[] hex = hexa.toCharArray();
        String[] HEX_BIN = {"0000", "0001", "0010", "0011", "0100", "0101", "0110",
                "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110","1111"};

        for (int charInd = 0; charInd < string.length(); charInd++)
        {
            for (int ind = 0; ind < hex.length; ind++)
            {
                if (string.charAt(charInd) == hex[ind])
                {
                    transform16To2 += HEX_BIN[ind];
                }
            }
        }
        return transform16To2;
    }
    public static String hex2Oct(String string)
    {
        String stringBin = hex2Bin(string);
        return bin2Oct(stringBin);
    }
    public static String hex2Dec(String string)
    {
        String stringBin = hex2Bin(string);
        return bin2Dec(stringBin);
    }
    public static String hex2Hex(String string)
    {
        return string;
    }

    public static String toRadix(String string, int inRadix, int outRadix)
    {
        if (inRadix == 2 && outRadix == 2 && isBinary(string))
        {
            return bin2Bin(string);
        }
        else if (inRadix == 2 && outRadix == 8 && isBinary(string))
        {
            return bin2Oct(string);
        }
        else if (inRadix == 2 && outRadix == 10 && isBinary(string))
        {
            return bin2Dec(string);
        }
        else if (inRadix == 2 && outRadix == 16 && isBinary(string))
        {
            return bin2Hex(string);
        }
        else if (inRadix == 8 && outRadix == 2 && isOctal(string))
        {
            return oct2Bin(string);
        }
        else if (inRadix == 8 && outRadix == 8 && isOctal(string))
        {
            return oct2Oct(string);
        }
        else if (inRadix == 8 && outRadix == 10 && isOctal(string))
        {
            return oct2Dec(string);
        }
        else if (inRadix == 8 && outRadix == 16 && isOctal(string))
        {
            return oct2Hex(string);
        }
        else if (inRadix == 10 && outRadix == 2 && isDecimal(string))
        {
            return dex2Bin(string);
        }
        else if (inRadix == 10 && outRadix == 8 && isDecimal(string))
        {
            return dec2Oct(string);
        }
        else if (inRadix == 10 && outRadix == 10 && isDecimal(string))
        {
            return dec2Dec(string);
        }
        else if (inRadix == 10 && outRadix == 16 && isDecimal(string))
        {
            return dec2Hex(string);
        }
        else if (inRadix == 16 && outRadix == 2 && isHexaDecimal(string))
        {
            return hex2Bin(string);
        }
        else if (inRadix == 16 && outRadix == 8 && isHexaDecimal(string))
        {
            return hex2Oct(string);
        }
        else if (inRadix == 16 && outRadix == 10 && isHexaDecimal(string))
        {
            return hex2Dec(string);
        }
        else if (inRadix == 16 && outRadix == 16 && isHexaDecimal(string))
        {
            return hex2Hex(string);
        }
        return null;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number and radix:");
        String string = scan.nextLine().toUpperCase();
        System.out.print("Enter the input radix: ");
        int inRadix = Integer.parseInt(scan.nextLine());
        System.out.print("Enter the output radix: ");
        int outRadix =Integer.parseInt(scan.nextLine());
        scan.close();
        System.out.print("\"" + string + "\" in radix " + inRadix + " is: \"" + toRadix(string, inRadix, outRadix) + "\" in radix " + outRadix);
    }
}


