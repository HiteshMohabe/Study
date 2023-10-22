package Classes;

import java.util.Scanner;

public class SwitchCase {

	static Scanner s = new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
		
		System.out.println("Enter month");
		String month = s.next();
		switch(month)
		{
		case "jan":
			System.out.println("jan");
			break;
		case "feb":
			System.out.println("feb");
			break;
		case "mar":
			System.out.println("mar");
			break;
		case "apr":
			System.out.println("apr");
			break;
		case "may":
			System.out.println("may");
			break;
		case "jun":
			System.out.println("jun");
			break;
		case "july":
			System.out.println("july");
			break;
		case "aug":
			System.out.println("aug");
			break;
		case "sep":
			System.out.println("sep");
			break;
		case "oct":
			System.out.println("oct");
			break;
		case "nov":
			System.out.println("nov");
			break;
		case "dec":
			System.out.println("dec");
			break;
		default:
			System.out.println("invalid Input");
			break;
		}

	}

}
