public class PrintDayInWord 
{
	public static void main(String[] args) 
	{
		int number = 5;
		System.out.println("The number is " + number);
		//use if - else
		if (number == 1)
		{
			System.out.println("MONDAY");
		}
		else if (number == 2)
		{
			System.out.println("TUESDAY");
		}
		else if (number == 3)
		{
			System.out.println("WENESDAY");
		}
		else if (number == 4)
		{
			System.out.println("THURDAY");
		}
		else if (number == 5)
		{
			System.out.println("FRIDAY");
		}
		else if (number == 6)
		{
			System.out.println("SATURDAY");
		}
		else if (number == 0)
		{
			System.out.println("SUNDAY");
		}
		else
		{
			System.out.println("Not a valid day");
		}
	
		// use switch - case
		switch(number)
		{
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WENESDAY");
			break;
		case 4:
			System.out.println("THURDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		case 0:
			System.out.println("SUNDAY");
			break;
		default:
			System.out.println("Not a valid day");
			break;
		}

	}

}
