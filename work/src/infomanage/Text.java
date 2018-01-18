package infomanage;
import java.util.*;
public class Text {
	public static void main(String args[])
	{
		Company com=new Company("王五",1,26,200);
		Text b=new Text();
		int select;
		Scanner input=new Scanner(System.in);
		while(true)
		{
			System.out.println("操作选项");
			System.out.println("1.添加员工信息");
			System.out.println("2.修改员工信息");
			System.out.println("3.显示员工信息");
			System.out.println("4.退出");
			System.out.println("选择操作：");
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
		System.out.println("输入id:");
		while(true)
		{
			int i;
			int j=0;
			ss.eid=input.nextInt();
			for(i=0;i<com.count;i++)
			{
				if(ss.eid==com.emp[i].eid)
				{
					System.out.println("编号已存在，请重试");
					j=1;
					break;
				}
				
			}
			if(j==0)
				break;
		}
		System.out.println("输入姓名：");
		ss.ename=input.next();
		System.out.println("输入年龄：");
		ss.eage=input.nextInt();
		System.out.println("输入工资：");
		ss.salary=input.nextFloat();
		return ss;
	}
	
	
	
	public Company updata(Company com)
	{
		int id,i,j;
		Scanner input=new Scanner(System.in);
		System.out.println("输入编号：");
		while(true)
		{
			id=input.nextInt();
			for(i=0;i<com.count;i++)
			{
				if(id==com.emp[i].eid)
				{
					Employee a=new Employee();
					a.eid=id;
					System.out.println("输入姓名：");
					a.ename=input.next();
					System.out.println("输入年龄：");
					a.eage=input.nextInt();
					System.out.println("输入工资：");
					a.salary=input.nextFloat();
					com.emp[i]=a;
					return com;
				}
			}
			System.out.println("标号不存在，请重试");
		}
	}
	public void display(Company com)
	{
		int i;
		System.out.println("编号\t"+"姓名\t"+"年龄\t"+"工资");
		for(i=0;i<com.count;i++)
		{
			
			System.out.println(com.emp[i].eid+"\t"+com.emp[i].ename+"\t"+com.emp[i].eage+"\t"+com.emp[i].salary);
		}
	}
}
