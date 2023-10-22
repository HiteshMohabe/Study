package Classes;
// 17 sep class
public class StringDemo 
{
	public void add(int a, int b, int c)
	{
		int sum=a+b+c;
		System.out.println(sum);
	}
	
	// String immutable mean --> once you define string so it can't be changed
	// String mutable mean --> once you define string so it can be changed
	// String Store in heap area but their is once separate memory that is String constant pool Area memory
	
	public static void s()
	{
	// Using String Literal
	String str = "java";
	String str1 = "java";
	String str2 = "java";
	String str6 = "java";
	// Using new keyword
	String str3=new String("java");
	String str4=new String("java");
	String str5=new String("java").intern();
	System.out.println(str);
	System.out.println(str1);
	if(str==str1)
	{
		System.out.println("str & str1 both are same");
	}
	else 
	{
		System.out.println("str & str1 both are different");
	}
	if(str3==str4)
	{
		System.out.println("str3 & str4 both are same");
	}
	else 
	{
		System.out.println("str3 & str4 both are different");
	}
	if(str==str4)
	{
		System.out.println("str & str4 both are same");
	}
	else 
	{
		System.out.println("str & str4 both are different");
	}
	
	// If user write intern funcation so it will check same value in string constant pool are memory and
	//	if value is avalible so it will assign same value mean it will store string object into string pool 
	if(str==str5)
	{
		System.out.println("str & str5 both are same");
	}
	else 
	{
		System.out.println("str & str5 both are different");
	}
	// it will check/compare value not address
	System.out.println(str3.equals(str4));
	System.out.println(str3.equalsIgnoreCase(str4));
	
	// concat function join 2 strings
		str6= str6.concat(" Test");
		System.out.println(str6);
	}
	
	public static void s1()
	{
		String xyz = "Hitesh";
		System.out.println(xyz.toLowerCase());
		System.out.println(xyz);
		System.out.println(xyz.lastIndexOf("H"));
		System.out.println(xyz.indexOf("h"));
		System.out.println(xyz.contains("i"));
		System.out.println(xyz.startsWith("H"));
		System.out.println(xyz.endsWith("h"));
	}
	
	public static void s2()
	{
		String s="25";
		System.out.println(Integer.parseInt(s));
	}
	
	public static void s3()
	{
		String[] s= {"abc", "123", "hitesh", "mohabey", "456"};
		for (int i=0; i<s.length;i++)
		{
			System.out.println(Integer.parseInt(s[i])); 
		}
	}
	
	public static void s4()
	{
		String s = "my name is hitesh mohabey";
		String[] s2 = s.split(" ");
		for(String x:s2)
		{
			System.out.println(x);
		}	
		System.out.println(s.replace(" ", "-"));
	}
	
	public static void s5()
	{
		String email ="abc@gmail.com";
		System.out.println(email.split("@")[0]);
		System.out.println(email.substring(0, email.indexOf("@")));
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		s5();
	}

}
