package text;

public class paixu {
	public static void main(String args[])
	{
		int a[]=new int[]{10,9,4,8,6,1,5,0,3,2};
		int t,i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
