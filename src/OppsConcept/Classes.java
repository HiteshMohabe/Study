package OppsConcept;

// In class we define multiple classes but it should only one public class & it should be always 
// same as file name

public class Classes 
{
	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);		
	}
	
	// access modifier Static/non static/ return type
	
	public void add1(int a, int b)
	{
		System.out.println(a+b);
	}
	
		
	
	
	public static void main(String[] args) 
	{
		Classes  c = new Classes();
		c.add1(10,20);
	}
}

class test
{

}
