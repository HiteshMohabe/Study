package Classes;
// 17 sep class
import java.util.Arrays;
import java.util.Scanner;

public class ArryTest {

	static Scanner sc = new Scanner(System.in);

	public static void arry() {
		int[] arr = { 2, 113, 123, 36, 0 };

		int arr1[] = { 2, 113, 123, 36, 0 };

		int size = arr.length;
		int size1 = arr1.length;
		System.out.println(size);
		System.out.println(size1);
		System.out.println("before shorting");

		for (int i = 0; i <= 4; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------");
		Arrays.sort(arr);
		for (int i = 0; i <= 4; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void arry1() {
		int[] arr = new int[5];
		System.out.println("enter your value");
		for (int i = 0; i <= 4; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void arry2() {
		int sum=0;
		int[] arr = {12, 23, 54, 67, 1 };
		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//			sum=sum+arr[i];
//		}
//		System.out.println(sum);
		
		// using while loop
		//enhance for loop
		for(int j:arr)
		{
			System.out.println(j);
//			sum=sum+j;
			sum += j;
		}		
		System.out.println(sum);
	}

	public static void maxarry() 
	{
		
		int[] arr = {10,4,67,34,97,3,100,69};
		int max=arr[0];
		int max1=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max1)
			{
				max1=arr[i];
			}
		}
		System.out.println(max1);
	}
	
	public static void minarry() 
	{
		
		int[] arr = {10,4,67,34,97,3,100,69};
		int max=arr[0];
		int max1=Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<max1)
			{
				max1=arr[i];
			}
		}
		System.out.println(max1);
	}
	
	public static void sort()
	{
		int[] arr = {5,3,4,1,2};
		int s=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					s=arr[i];
					arr[i]=arr[j];
					arr[j]=s;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));		
		
	}
	
	// WTP of copy all element of on arry into another array
	public static void copy_arry()
	{
		int[] a= {1,2,3,4,5};
		int[] b= new int[5];
		for(int i =0; i<a.length; i++)
		{
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	
	// WTP print duplicate value of array
	public static void dulicate()
	{
		int[] arr= {1,4,1,4,6,8,9,6,1,1};
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
			if(arr[i]==arr[j]) 
			{
				System.out.println(arr[i]);
			}
		}
		}
	}
	
	// WTP print even / odd position of array
	public static void odd_even()
	{
		int[] arr= {12,4,3,5,8,45,86};
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] % 2 ==0)
			{
				System.out.println("even value is : "+arr[i]);
			}
			else {
				System.out.println("odd value is : "+arr[i]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		dulicate();

	}

}
