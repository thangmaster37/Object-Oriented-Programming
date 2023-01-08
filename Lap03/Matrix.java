package homework3;
import java.util.Scanner;
public class Matrix
{
    public static int[][] createRandomMatrixInt(int rows, int cols)
    {
        if (rows !=0 && cols != 0)
        {
            int[][] matrix = new int[rows][cols];
            for (int i = 0; i < rows; i++)
            {
                for (int k = 0; k < cols; k++)
                {
                    double randomDouble = Math.random();
                    randomDouble = randomDouble * 100 + 1;
                    matrix[i][k] = (int) randomDouble;
                }
            }
            return matrix;
        }

        return null;

    }

    public static double[][] createRandomMatrixDouble(int rows, int cols)
    {
        if (rows !=0 && cols != 0)
        {
            double[][] matrix = new double[rows][cols];
            for (int i = 0; i < rows; i++)
            {
                for (int k = 0; k < cols; k++)
                {
                    double randomDouble = Math.random();
                    matrix[i][k] = randomDouble * 100 + 1;
                }
            }
            return matrix;
        }

        return null;

    }

    public static void print(int[][] matrix)
    {
        if (matrix != null)
        {
            for (int i = 0; i < matrix.length; i++)
            {
                for (int k = 0; k < matrix[0].length; k++)
                {
                    System.out.print(matrix[i][k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void print(double[][] matrix)
    {
        if (matrix != null)
        {
            for (int i = 0; i < matrix.length; i++)
            {
                for (int k = 0; k < matrix[0].length; k++)
                {
                    System.out.print(matrix[i][k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2)
    {
        if (matrix1 != null && matrix2 != null)
        {
            if ((matrix1.length == matrix2.length) && (matrix1[0].length == matrix2[0].length))
            {
                return true;
            }
        }
        return false;

    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2)
    {
        if (matrix1 != null && matrix2 != null)
        {
            if ((matrix1.length == matrix2.length) && (matrix1[0].length == matrix2[0].length))
            {
                return true;
            }
        }
        return false;
    }


    public static int[][] add(int[][] matrix1, int[][] matrix2)
    {
        if (haveSameDimension(matrix1, matrix2))
        {
            int[][] add = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++)
            {
                for (int k = 0; k < matrix1[0].length; k++)
                {
                    add[i][k] = matrix1[i][k] + matrix2[i][k];
                }
            }
            return add;
        }
        return null;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2)
    {
        if (haveSameDimension(matrix1, matrix2))
        {
            double[][] add = new double[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++)
            {
                for (int k = 0; k < matrix1[0].length; k++)
                {
                    add[i][k] = matrix1[i][k] + matrix2[i][k];
                }
            }
            return add;
        }
        return null;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2)
    {
        if (haveSameDimension(matrix1, matrix2))
        {
            int[][] subtract = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++)
            {
                for (int k = 0; k < matrix1[0].length; k++)
                {
                    subtract[i][k] = matrix1[i][k] - matrix2[i][k];
                }
            }
            return subtract;
        }
        return null;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2)
    {
        if (haveSameDimension(matrix1, matrix2))
        {
            double[][] subtract = new double[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++)
            {
                for (int k = 0; k < matrix1[0].length; k++)
                {
                    subtract[i][k] = matrix1[i][k] - matrix2[i][k];
                }
            }
            return subtract;
        }
        return null;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2)
    {
        if (matrix1 != null && matrix2 != null)
        {
            if (matrix1[0].length == matrix2.length)
            {
                int[][] multiply = new int[matrix1.length][matrix2[0].length];
                for (int row = 0; row < matrix1.length; row++)
                {
                    for (int col = 0; col < matrix2[0].length; col++)
                    {
                        for (int ind = 0; ind < matrix1[0].length; ind++)
                        {
                            multiply[row][col] += matrix1[row][ind] * matrix2[ind][col];
                        }
                    }
                }
                return multiply;
            }
        }
        return null;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2)
    {
        if (matrix1 != null && matrix2 != null)
        {
            if (matrix1[0].length == matrix2.length)
            {
                double[][] multiply = new double[matrix1.length][matrix2[0].length];
                for (int row = 0; row < matrix1.length; row++)
                {
                    for (int col = 0; col < matrix2[0].length; col++)
                    {
                        for (int ind = 0; ind < matrix1[0].length; ind++)
                        {
                            multiply[row][col] += matrix1[row][ind] * matrix2[ind][col];
                        }
                    }
                }
                return multiply;
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the rowInt1: ");
        int rowInt1 = scan.nextInt();
        System.out.print("Enter the colInt1: ");
        int colInt1 = scan.nextInt();
        System.out.print("Enter the rowInt2: ");
        int rowInt2 = scan.nextInt();
        System.out.print("Enter the colInt2: ");
        int colInt2 = scan.nextInt();
        scan.close();

        int[][] matrixInt1 = createRandomMatrixInt(rowInt1, colInt1);
        int[][] matrixInt2 = createRandomMatrixInt(rowInt2, colInt2);

        print(matrixInt1);
        print(matrixInt2);

        int[][] addInt = add(matrixInt1, matrixInt2);
        int[][] subtractInt = subtract(matrixInt1, matrixInt2);
        int[][] mulInt = multiply(matrixInt1, matrixInt2);

        if (addInt != null)
        {
            System.out.println("Sum of two matrices is: ");
            print(addInt);
        }
        else
        {
            System.out.println("NULL");
        }
        if (subtractInt != null)
        {
            System.out.println("Subtract of two matrices is: ");
            print(subtractInt);
        }
        else
        {
            System.out.println("NULL");
        }
        if (mulInt != null)
        {
            System.out.println("Multiply of two matrices is: ");
            print(mulInt);
        }
        else
        {
            System.out.println("NULL");
        }

    }
}
