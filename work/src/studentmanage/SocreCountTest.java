package studentmanage;
import java.util.*;
public class SocreCountTest {
	public static void main(String args[])
	{
		SocreCount stus[]=new SocreCount[5];
		SocreCountTest a=new SocreCountTest();
		Scanner input=new Scanner(System.in);
		int i;
		for(i=0;i<stus.length;i++)
		{
			SocreCount ss=new SocreCount();
			System.out.println("输入第"+(i+1)+"名学生姓名：");
			ss.name=input.next();
			System.out.println("请输入语文成绩：");
			while(true)
			{
				ss.chineseSocre=input.nextFloat();
				if(ss.chineseSocre<0 || ss.chineseSocre>150)
				{
					System.out.println("数据错误，请重新输入！");
				}
				else
					break;
			}
			System.out.println("请输入数学成绩：");
			while(true)
			{
				ss.mathSocre=input.nextFloat();
				if(ss.mathSocre<0 || ss.mathSocre>150)
					System.out.println("数据错误，请重新输入！");
				else
					break;
			}
			
			System.out.println("请输入英语成绩：");
			while(true)
			{
				ss.englishSocre=input.nextFloat();
				if(ss.englishSocre<0 || ss.englishSocre>150)
					System.out.println("数据错误，请重新输入！");
				else
					break;
			}
			stus[i]=ss;
		}
		a.avarege(stus);
	}
	public void avarege(SocreCount[] stus)
	{
		int j,k;
		float avarege;
		for(j=0;j<stus.length;j++)
		{
			avarege=(stus[j].chineseSocre+stus[j].englishSocre+stus[j].mathSocre)/3;
			System.out.println(stus[j].name+"的平均分为"+avarege);
		}
		avarege=(stus[0].chineseSocre+stus[1].chineseSocre+stus[2].chineseSocre+stus[3].chineseSocre+stus[4].chineseSocre)/5;
		System.out.println("语文平均分为"+avarege);
		avarege=(stus[0].mathSocre+stus[1].mathSocre+stus[2].mathSocre+stus[3].mathSocre+stus[4].mathSocre)/5;
		System.out.println("数学平均分为"+avarege);
		avarege=(stus[0].englishSocre+stus[1].englishSocre+stus[2].englishSocre+stus[3].englishSocre+stus[4].englishSocre)/5;
		System.out.println("英语平均分为"+avarege);
	}
}
