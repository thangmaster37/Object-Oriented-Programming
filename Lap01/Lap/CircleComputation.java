import java.util.Scanner;
public class CircleComputation 
{

	public static void main(String[] args) 
	{
		double radius;
		double diameter;
		double circumference;
		double area;
		Scanner scan = new Scanner(System.in);
		radius = scan.nextDouble();
		
		diameter = 2.0 * radius;
		area = Math.PI * radius * radius;
		circumference = 2.0 * Math.PI * radius;
				
		System.out.printf("Diameter is : %.2f%n", diameter);
		System.out.printf("Area is : %.2f%n", area);
		System.out.printf("Circumference is : %.2f%n", circumference);
		scan.close();
	}

}
