import java.util.Scanner;
class Pin 
{
	public static void main(String[] args) 
	{

	Scanner s = new Scanner (System.in);

		int attempt = 0;
		int pin = 1234;
		
	do
	{
		System.out.println("ENTER YOUR PIN -HERE-");
		   int pass = s.nextInt();

		if (pass==pin)
		{

			System.out.println("LOGIN SUCESSFUL-");
				break;

		}
		else
		{
			System.out.println("INCORRECT PIN PLEASE TRY AGAIN-");
	
	    }
			attempt++;
	}

	while (attempt<5);
		if (attempt==5)
		{
			System.out.println("MAXIMUM TIME REACHED- !");
		}
	}
}
