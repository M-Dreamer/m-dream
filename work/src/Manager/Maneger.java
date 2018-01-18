package Manager;
import java.util.Scanner;
public class Maneger {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int i,j,k;
		System.out.println("学生人数：");
		i=input.nextInt();
		String name[]=new String[i];
		//String name1;
		int socre[][]=new int[i][3];
		for(j=0;j<i;j++)
		{
			System.out.println("输入第"+(j+1)+"名学生姓名：");
			//name1=ss.inputname();
			name[i]=input.nextLine();
			for(k=0;k<3;k++)
			{
				System.out.println("请输入三门课程的分数：");
				socre[i][k]=input.nextInt();
			}
		}
		System.out.println("显示所有信息：");
		System.out.println("编号\t"+"姓名\t"+"socre1\t"+"socre2\t"+"socre3");
		for(j=0;j<i;j++)
		{
			System.out.println(i+"\t"+name[i]+"\t"+socre[i][0]+"\t"+socre[i][1]+"\t"+socre[i][2]);
		}
	}
	public String inputname()
	{
		Scanner input=new Scanner(System.in);
		String name;
		name=input.next();
		return name;
	}
	public int inputsocre()
	{
		int socre;
		Scanner input=new Scanner(System.in);
		while(true)
		{
			
			socre=input.nextInt();
			if(socre<0 || socre>100)
			{
				System.out.println("输入错误，请重新输入");
			}
			else
				break;
			
		}
		return socre;
	}

}
