package Classes;

import java.util.Scanner;

public class ForLoop {

	static Scanner in = new Scanner(System.in);
	
			static void demo() 
	{
		for(int i=0; i<=5; i= i+1)
		{
			System.out.println("hello");
		}
	}

	static void demo1()
	{
		int i=1;
		while (i<=5)
		{
			System.out.println("java");
			i=i+1;
			//					i++;
			//					i+=1;
		}
	}

	static void demo2()
	{
		System.out.println("Enter any number");
		int b=in.nextInt();
		int sum=0;
		
		for (int i=1; i<=b; i++)
		{
			sum=sum+i;
		}
		System.out.println("total sum is : "+sum);
	}
	public static void main(String[] args) 
	{
		// for, while, do while
		demo2();

	}

}



// print the sun of number 