package Basic;

public class Demo {
	
	 int a=10;
	
	 void add()
	
	{
		System.out.println("Add method run");
	}
	
	 Demo()
		{
			System.out.println("constructor run");
		}
	{
		System.out.println("static block run");
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("main method run");
		
		
//		System.out.println(a);
//		System.out.println(Demo.a);
		Demo d = new Demo();
//		System.out.println(d.b);

	}

}
