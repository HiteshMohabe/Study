package OppsConcept;

public class Demo
{
	public void test() 
	{
		System.out.println("test");
	}

	void test1() 
	{
		System.out.println("test1");	
	}

	private void test2() 
	{
		System.out.println("test2");
	}

	protected void test3() 
	{
		System.out.println("test3");
	}

	public static void main(String[] args) 
	{
		Demo t = new Demo();
		t.test();
		t.test1();
		t.test2();
		t.test3();
		
	}
}
