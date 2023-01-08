import java.util.Arrays;
import java.util.Scanner;
public class GradesStatistics211
{
    public static int[] grades;

    public static void readGrades()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = scan.nextInt();
        while (students < 0)
        {
            students = scan.nextInt();
        }
        grades = new int[students];

        for (int i = 0; i < grades.length; i++)
        {
            System.out.print("Enter the grade for student " + (i + 1) + " : ");
            grades[i] = scan.nextInt();
            while (grades[i] < 0 || grades[i] > 100)
            {
                grades[i] = scan.nextInt();
            }
        }
        scan.close();
    }

    public static void print(int[] array)
    {
        System.out.print("The grades are: [");
        for (int i = 0; i < array.length; i++)
        {
            if (i == 0)
            {
                System.out.print(array[i]);
            }
            else
            {
                System.out.print(", " + array[i]);
            }
        }
        System.out.println("]");
    }

    public static double average(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        double average = 1.0 * sum / array.length;
        return  average;
    }

    public static double median(int[] array)
    {
        double median;
        Arrays.sort(array);
        if (array.length % 2 == 0)
        {
            median = 1.0 * (array[(array.length - 1) / 2] + array[((array.length - 1) / 2) + 1]) / 2;
        }
        else
        {
            median = array[(array.length - 1) / 2];
        }
        return median;
    }

    public static int min(int[] array)
    {
        int min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (min > array[i])
            {
                min = array[i];
            }
        }
        return min;

    }

    public static int max(int [] array)
    {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (max < array[i])
            {
                max = array[i];
            }
        }
        return max;

    }

    public static double stdDev(int[] array)
    {
        double sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += Math.pow(array[i], 2) - Math.pow(average(array), 2);
        }
        double variance = 1.0 * sum / array.length;
        return Math.sqrt(variance);
    }

    public static void main(String[] args)
    {
        readGrades();
        System.out.println("The grades are: ");
        print(grades);
        System.out.printf("The average is: %.2f \n", average(grades));
        System.out.printf("The median is: %.2f \n", median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f", stdDev(grades));


    }
}
