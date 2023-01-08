import java.util.Scanner;

public class AverageWithInputValidation 
{
	public static void main(String[] args) 
	{
		final int NUM_STUDENT = 3;
        	int numberIn;
        	boolean isValid;
        	int sum = 0;
        	double average;


        	for (int studentNo = 1; studentNo <= NUM_STUDENT; ++studentNo) 
        	{
            		isValid = false;
            		do 
            		{
                		Scanner scan = new Scanner(System.in);
                		System.out.print("Enter the mark (0-100) for student" + studentNo + ":");
                		numberIn = scan.nextInt();

                		if (numberIn >= 0 && numberIn <= 100 ) 
                		{
                    			isValid = true;

                		} 
                		else 
                		{
                    			System.out.println("Invalid input, try again ...");
                		}
            		}
            
            		while (!isValid);
            		sum += numberIn;

        	}
        
        	average = (double)sum/NUM_STUDENT;

        	System.out.printf("The average is : %.2f%n", average);
    	}
}
