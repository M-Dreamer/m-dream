package a;

import java.util.Scanner;

public class a {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		test3();
	}
	
	public static int f(int i)
	{
		if(i==1 || i==2)
			return 1;
		else
			return f(i-1)+f(i-2);
	}
	
	public static void fenjie(int i)
	{
		int arr[]=new int[100];
		int count=0;
		int j=2;
		int b=i;
		
		while(true)
		{
			int c=b;
			if(c%j==0)
			{
				arr[count]=j;
				count++;
				b=c/j;
			}
			else
			{
				j++;
			}
			if(b==1)
				break;
		}
		System.out.print(i+"=");
		for(int l=0;l<count;l++)
		{
			if(l!=count-1)
				System.out.print(arr[l]+"*");
			else
				System.out.print(arr[l]);
		}
		System.out.println();
	}
	
	public static void test(int i)
	{
		String str=i>=90?"A":((i>=60)?"B":"c");
		
		System.out.println(str);
	}
	
	public static void test1(int i,int j)
	{
		long total=0;
		long count=0;
		long[] arr=new long[j];
		for(int l=0;l<j;l++)
		{
			if(l==0)
			{
				total=i;
				count=count+total;
				arr[l]=total;
				//System.out.println(total);
			}
			else
			{
				long y=i;
				for(int a=0;a<l;a++)
				{
					y=y*10;
				}
				//System.out.println(y);
				total=total+y;
				count=count+total;
				arr[l]=total;
				//System.out.println(total);
			}
		}
		
		
		for(int h=0;h<j;h++)
		{
			if(h==j-1)
				System.out.print(arr[h]);
			else
				System.out.print(arr[h]+"+");
		}
		
		System.out.print("="+count);
	}
	public static boolean test2(int a)
	{
		int b=a;
		int count=0;
		for(int i=1;i<b;i++)
		{
			if(a%i==0)
			{
				count=count+i;
			}
		}
		
		if(a==count)
			return true;
		else
			return false;
	}
	
	
	public static void test3()
	{
		double count=0;
		double d=100;
		for(int i=0;i<10;i++)
		{
			count=count+d;
			d=d/2;
			System.out.println("第"+(i+1)+"次弹"+d+"米");
			count=count+d;
		}
		
		System.out.println("第十次落地时求经过了"+(count-d)+"米");
	}
}
