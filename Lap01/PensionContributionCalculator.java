import java.util.Scanner;

public class PensionContributionCalculator 
{

	public static void main(String[] args) 
	{
		final int SALARY_CEILING  = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		
		Scanner scan = new Scanner(System.in);
		int salary = scan.nextInt();
		int age = scan.nextInt();
		
		
		double employeeContribution;
		double employerContribution;
		double totalContribution;
		
		System.out.println("Enter the monthly salary: $" + salary);
		System.out.println("Enter the age: $" + age);
		if (salary >= SALARY_CEILING)
		{
			salary = SALARY_CEILING;
		}
		else
		{
			salary = salary;
		}
		
		if (age <= 55)
		{
			employeeContribution = EMPLOYEE_RATE_55_AND_BELOW * salary;
			employerContribution = EMPLOYER_RATE_55_AND_BELOW * salary;
			totalContribution = employeeContribution + employerContribution;
			
		}
		else if (age <= 60)
		{
			employeeContribution = EMPLOYEE_RATE_55_TO_60 * salary;
			employerContribution = EMPLOYER_RATE_55_TO_60 * salary;
			totalContribution = employeeContribution + employerContribution;
		
		}
		else if (age <= 65)
		{
			employeeContribution = EMPLOYEE_RATE_60_TO_65 * salary;
			employerContribution = EMPLOYER_RATE_60_TO_65 * salary;
			totalContribution = employeeContribution + employerContribution;
		
		}
		else
		{
			employeeContribution = EMPLOYEE_RATE_65_ABOVE * salary;
			employerContribution = EMPLOYER_RATE_65_ABOVE * salary;
			totalContribution = employeeContribution + employerContribution;
		
		}
		System.out.printf("The employee's contribution is: $%.2f%n" , employeeContribution);
		System.out.printf("The employer's contribution is: $%.2f%n" , employerContribution);
		System.out.printf("The total contribution is: $%.2f%n" , totalContribution);
		scan.close();
	}

}
