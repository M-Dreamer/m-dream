package infomanage;
import java.util.*;
public class Text {
	public static void main(String args[])
	{
		Company com=new Company("����",1,26,200);
		Text b=new Text();
		int select;
		Scanner input=new Scanner(System.in);
		while(true)
		{
			System.out.println("����ѡ��");
			System.out.println("1.���Ա����Ϣ");
			System.out.println("2.�޸�Ա����Ϣ");
			System.out.println("3.��ʾԱ����Ϣ");
			System.out.println("4.�˳�");
			System.out.println("ѡ�������");
			select=input.nextInt();
			switch(select)
			{
				case 1:
					com.emp[com.count]=b.infoadd(com);
					com.count++;
					break;
				case 2:
					com=b.updata(com);
					break;
				case 3:
					b.display(com);
					break;
				case 4:
					return ;
			}
		}
	}
	
	
	public Employee infoadd(Company com)
	{
		Scanner input=new Scanner(System.in);
		Employee ss=new Employee();
		System.out.println("����id:");
		while(true)
		{
			int i;
			int j=0;
			ss.eid=input.nextInt();
			for(i=0;i<com.count;i++)
			{
				if(ss.eid==com.emp[i].eid)
				{
					System.out.println("����Ѵ��ڣ�������");
					j=1;
					break;
				}
				
			}
			if(j==0)
				break;
		}
		System.out.println("����������");
		ss.ename=input.next();
		System.out.println("�������䣺");
		ss.eage=input.nextInt();
		System.out.println("���빤�ʣ�");
		ss.salary=input.nextFloat();
		return ss;
	}
	
	
	
	public Company updata(Company com)
	{
		int id,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("�����ţ�");
		while(true)
		{
			id=input.nextInt();
			for(i=0;i<com.count;i++)
			{
				if(id==com.emp[i].eid)
				{
					Employee a=new Employee();
					a.eid=id;
					System.out.println("����������");
					a.ename=input.next();
					System.out.println("�������䣺");
					a.eage=input.nextInt();
					System.out.println("���빤�ʣ�");
					a.salary=input.nextFloat();
					com.emp[i]=a;
					return com;
				}
			}
			System.out.println("��Ų����ڣ�������");
		}
	}
	public void display(Company com)
	{
		int i;
		System.out.println("���\t"+"����\t"+"����\t"+"����");
		for(i=0;i<com.count;i++)
		{
			
			System.out.println(com.emp[i].eid+"\t"+com.emp[i].ename+"\t"+com.emp[i].eage+"\t"+com.emp[i].salary);
		}
	}
}
