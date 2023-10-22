package Classes;

import java.util.Scanner;

public class If_else 
{
	static Scanner in = new Scanner(System.in);
	static void assignmnet() 
	{
		// find even & odd number
		// find maximum number

		System.out.println("enter 1st number");
		int a=in.nextInt();
		if(a % 2 == 0)
		{
			System.out.println("no. is even");
		}
		else
		{
			System.out.println("no.id odd");
		}

		System.out.println("enter 2nd number");
		int b=in.nextInt();

		System.out.println("enter 3rd number");
		int c=in.nextInt();
//		int max =(a>b)? (a>c? a:c):(b>c? b:c);
//		System.out.println(max);
		if(a>b && a>c)
		{
			System.out.println("a value is greate than b & c value");
		}
		else if(b>a && b>c)
		{
			System.out.println("b value is greate than a & c value");
		} 
		else if(c>b && c>a)
		{
			System.out.println("c value is greate than a & b value");
		} 

	}

	static void assignment1()
	{	
		System.out.println("enter 1st subject marks");
		double a=in.nextDouble();
		System.out.println("enter 1st subject marks");
		double b=in.nextDouble();
		System.out.println("enter 1st subject marks");
		double c=in.nextDouble();
		double sum= a+b+c;
		System.out.println("Sum of marks :"+ sum);
		System.out.println("enter total marks");
		double d=in.nextDouble();
		double percentage=(a/d) * 100;
		System.out.println("percentege is :"+ percentage);
		int percentage1 = (int) percentage;
		switch(percentage1)
		{
		case 1:
		
		}
	}

	static void assignment2() 
	{
//		int a=0;
//		int[] arr2 = new int[50];    
		for(int i=1; i<=10; i++)
		{
//			arr2[a]=i;
			if(i % 2 ==0)   
			{
				System.out.println(i+" is even number");
			}
		}

		//		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		//		for (int i=1; i <=arr.length; i++)
		//		{
		//		 if(i % 2 ==0)
		//		 {
		//			 System.out.println(i+" is even number");
		//		 }
		//		}
	}

	static void ifelse()
	{

	}

	static void nested_ifelse ()
	{

	}

	static void latteral_ifelse ()
	{

	}

	public static void main(String[] args) 
	{
		assignment2();

	}

}
