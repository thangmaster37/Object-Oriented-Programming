package homework3;
import java.util.Scanner;
public class DateUtil
{
    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                                        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static int[] x = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int[] daysInMonthLeaps = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static boolean isLeapYear(int year)
    {
        if ((year % 4 == 0 && year % 100 != 0 && year >= 0) || (year % 400 == 0 && year >= 0))
        {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day)
    {
        if (isLeapYear(year) && year >= 1 && year <= 9999)
        {
            if (month >= 1 && month <= 12)
            {
                if (day >= 1 && day <= daysInMonthLeaps[month - 1])
                {
                    return true;
                }
            }
        }
        else if ((!(isLeapYear(year))) && year >= 1 && year <= 9999)
        {
            if (month >= 1 && month <= 12)
            {
                if (day >= 1 && day <= daysInMonths[month - 1])
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day)
    {
        if (month < 3)
        {
            year -= 1;
        }
        int number = (year + (year / 4) - (year / 100) + (year / 400) + x[month - 1] + day) % 7;
        return number;
    }

    public static String printDate(int year, int month, int day)
    {
        String date = strDays[getDayOfWeek(year, month, day)] + " " + String.valueOf(day) + " " + strMonths[month - 1] + " " + String.valueOf(year);
        return date;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year:");
        int year = scan.nextInt();
        System.out.print("Enter the month:");
        int month = scan.nextInt();
        System.out.print("Enter the day:");
        int day = scan.nextInt();
        scan.close();

        System.out.println(isLeapYear(year));
        System.out.println(isValidDate(year, month, day));

        System.out.println(strDays[getDayOfWeek(year, month, day)]);
        System.out.println(printDate(year, month, day));
    }
}
