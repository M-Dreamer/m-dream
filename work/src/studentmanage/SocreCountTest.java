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
			System.out.println("�����"+(i+1)+"��ѧ��������");
			ss.name=input.next();
			System.out.println("���������ĳɼ���");
			while(true)
			{
				ss.chineseSocre=input.nextFloat();
				if(ss.chineseSocre<0 || ss.chineseSocre>150)
				{
					System.out.println("���ݴ������������룡");
				}
				else
					break;
			}
			System.out.println("��������ѧ�ɼ���");
			while(true)
			{
				ss.mathSocre=input.nextFloat();
				if(ss.mathSocre<0 || ss.mathSocre>150)
					System.out.println("���ݴ������������룡");
				else
					break;
			}
			
			System.out.println("������Ӣ��ɼ���");
			while(true)
			{
				ss.englishSocre=input.nextFloat();
				if(ss.englishSocre<0 || ss.englishSocre>150)
					System.out.println("���ݴ������������룡");
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
			System.out.println(stus[j].name+"��ƽ����Ϊ"+avarege);
		}
		avarege=(stus[0].chineseSocre+stus[1].chineseSocre+stus[2].chineseSocre+stus[3].chineseSocre+stus[4].chineseSocre)/5;
		System.out.println("����ƽ����Ϊ"+avarege);
		avarege=(stus[0].mathSocre+stus[1].mathSocre+stus[2].mathSocre+stus[3].mathSocre+stus[4].mathSocre)/5;
		System.out.println("��ѧƽ����Ϊ"+avarege);
		avarege=(stus[0].englishSocre+stus[1].englishSocre+stus[2].englishSocre+stus[3].englishSocre+stus[4].englishSocre)/5;
		System.out.println("Ӣ��ƽ����Ϊ"+avarege);
	}
}
