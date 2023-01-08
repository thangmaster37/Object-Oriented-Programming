import java.util.Scanner;
public class GradesStatistics
{
    public static double average(int [] grades)
    {
        int sum = 0;
        for (int i = 0; i < grades.length; i++)
        {
            sum += grades[i];
        }
        double average = 1.0 * sum / grades.length;
        return average;

    }

    public static int min(int [] grades)
    {
        int min = grades[0];
        for (int i = 0; i < grades.length; i++)
        {
            if (min > grades[i])
            {
                min = grades[i];
            }
        }
        return min;

    }

    public static int max(int [] grades)
    {
        int max = grades[0];
        for (int i = 0; i < grades.length; i++)
        {
            if (max < grades[i])
            {
                max = grades[i];
            }
        }
        return max;

    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scan.nextInt();
        while (numStudents < 0)
        {
            numStudents = scan.nextInt();
        }

        int[] grades = new int[numStudents];

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

        System.out.printf("The average is: %.2f \n", average(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
    }
}