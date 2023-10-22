package Classes;

public class PatternProgram 
{
	public static void pattern()
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern1()
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern2()
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=i; j<4; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
	}

	public static void pattern3()
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=i; j<=4; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
	}



	public static void main(String[] args) 
	{
		pattern3();

	}

}
