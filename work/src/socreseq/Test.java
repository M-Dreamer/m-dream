package socreseq;
import java.util.Scanner;
public class Test {
	public static void main(String args[])
	{
		float[] socres=new float[5];
		int i;
		Test ss=new Test();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入成绩(0~100)：");
		for(i=0;i<5;i++)
		{
			while(true)
			{
				System.out.println("请输入第"+(i+1)+"名学生成绩：");
				socres[i]=input.nextFloat();
				if(socres[i]<0 || socres[i]>100)
				{
					System.out.println("数据错误，请重新输入！");
				}
				else
					break;
			}
		}
		System.out.println("\r初始");
		for(i=0;i<socres.length;i++)
			System.out.println(socres[i]);
		System.out.println("\r排序后");
		ss.sortSocres(socres);
	}
	
	
	public void sortSocres(float[] socres)
	{
		int i,j;
		for(i=0;i<socres.length;i++)
		{
			for(j=0;j<socres.length-i-1;j++)
			{
				float a;
				if(socres[j]<socres[j+1])
				{
					a=socres[j];
					socres[j]=socres[j+1];
					socres[j+1]=a;
				}
			}
		}
		for(i=0;i<socres.length;i++)
			System.out.println(socres[i]);
	}
}
