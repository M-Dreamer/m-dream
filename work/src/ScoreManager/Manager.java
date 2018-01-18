package ScoreManager;
import java.util.*;
public class Manager {
	
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		int n;
		System.out.println("学生人数n：");
		n=ss.nextInt();
		Student[] a=new Student[n];
		Manager stus=new Manager();
		a=stus.input(a);
		stus.display(a);
		while(true)
		{
			System.out.println("1.修改学生信息");
			System.out.println("2.降序排序");
			System.out.println("3.升序排序");
			System.out.println("4.退出");
			System.out.println("请输入执行的操作：");
			int x=ss.nextInt();
			switch(x)
			{
				case 1:
					stus.updata(a);
					stus.display(a);
					break;
				case 2:
					System.out.println("1.按照课程1");
					System.out.println("2.按照课程2");
					System.out.println("3.按照课程3");
					System.out.println("4.按照总扥");
					System.out.println("5.按照编号");
					System.out.println("6.返回上一层");
					System.out.println("请选择操作：");
					int select=ss.nextInt();
					switch(select)
					{
						case 1:
						case 2:
						case 3:
						case 4:
						case 5:
							a=stus.jiangxupaixu(a, select);
							stus.display(a);
							break;
						case 6:
							break;
					}
					break;
				case 3:
					System.out.println("1.按照课程1");
					System.out.println("2.按照课程2");
					System.out.println("3.按照课程3");
					System.out.println("4.按照总扥");
					System.out.println("5.按照编号");
					System.out.println("6.返回上一层");
					System.out.println("请选择操作：");
					int index=ss.nextInt();
					switch(index)
					{
						case 1:
						case 2:
						case 3:
						case 4:
						case 5:
							a=stus.shengxupaixu(a, index);
							stus.display(a);
							break;
						case 6:
							break;
					}
					break;
					
				case 4:
					return ;
			}
		}
	}
	public Student[] input(Student []stus)
	{
		Scanner input=new Scanner(System.in);
		int k,l;
		
		for(k=0;k<stus.length;k++)
		{
			Student a=new Student();
			System.out.println("输入第"+(k+1)+"位学生姓名：");
			a.name=input.next();
			//System.out.println("输入第"+(k+1)+"位学生编号：");
			a.num=k;
			System.out.println("输入第"+(k+1)+"位学生的三门成绩(0~100)：");
			for(l=0;l<3;l++)
			{
				while(true)
				{
					a.socre[l]=input.nextFloat();
					if(a.socre[l]<0 || a.socre[l]>100)
					{
						System.out.println("数据错误，请重新输入！");
					}
					else
						break;
				}
			}
			a.sum=a.socre[0]+a.socre[1]+a.socre[2];
			stus[k]=a;
		}
		return stus;
	}
	
	public Student[] updata(Student[] stus)
	{
		int index,k;
		Scanner input=new Scanner(System.in);
		while(true)
		{
			System.out.println("请输入编号：");
			index=input.nextInt();
			for(k=0;k<stus.length;k++)
			{
				if(index==stus[k].num)
				{
					System.out.println("编号   \t 姓名 \t 课程1 \t 课程2 \t 课程3 \t 总分");
					System.out.println(stus[k].num+"\t"+stus[k].name+"\t"+stus[k].socre[0]+"\t"+stus[k].socre[1]+"\t"+stus[k].socre[2]+"\t"+stus[k].sum);
					Student a=new Student();
					System.out.println("请输入新的数据:");
					System.out.println("姓明：");
					a.name=input.next();
					System.out.println("请输入三门功课的成绩(0~100)：");
					for(k=0;k<3;k++)
					{
						while(true)
						{
							a.socre[k]=input.nextFloat();
							if(a.socre[k]<0 || a.socre[k]>100)
							{
								System.out.println("数据错误，请重新输入！");
							}
							else
								break;
						}
					}
					stus[k]=a;
				
					return stus;
				}
			}
			System.out.println("没有此编号，请重新输入！");
		}
	}
	
	public void display(Student []stus)
	{
		System.out.println("编号   \t 姓名 \t 课程1 \t 课程2 \t 课程3 \t 总分");
		int l;
		for(l=0;l<stus.length;l++)
		{
			System.out.println(stus[l].num+"\t"+stus[l].name +"\t"+stus[l].socre[0]+"\t"+stus[l].socre[1]+"\t"+stus[l].socre[2]+"\t"+stus[l].sum);
		}
	}
	
	public Student[] jiangxupaixu(Student[] stus,int index)
	{
		int b[]=new int[stus.length];
		int i,j,k;
		int l;
		for(i=0;i<stus.length;i++)
		{
			b[i]=i;
		}
		if(index==1 || index==2 || index==3)
		{
			
			for(j=0;j<stus.length;j++)
			{
				for(k=0;k<stus.length-j-1;k++)
				{
					if(stus[b[k]].socre[index-1]<stus[b[k+1]].socre[index-1])
					{
						l=b[k];
						b[k]=b[k+1];
						b[k+1]=l;
					}
				}
			}
		}
		if(index==4)
		{
			for(j=0;j<stus.length;j++)
			{
				for(k=0;k<stus.length-j-1;k++)
				{
					if(stus[j].sum<stus[j+1].sum)
					{
						l=b[k];
						b[k]=b[k+1];
						b[k+1]=l;
					}
				}
			}
		}
		if(index==5)
		{
			for(j=0;j<stus.length;j++)
			{
				for(k=0;k<stus.length-j-1;k++)
				{
					if(stus[j].num<stus[j+1].num)
					{
						l=b[k];
						b[k]=b[k+1];
						b[k+1]=l;
					}
				}
			}
		}
		Student[] ss=new Student[stus.length];
		for(i=0;i<stus.length;i++)
		{
			ss[i]=stus[b[i]];
		}
		
		return ss;
	}
	
	
	public Student[] shengxupaixu(Student[] stus,int index)
	{
		int b[]=new int[stus.length];
		int i,j,k;
		int l;
		for(i=0;i<stus.length;i++)
		{
			b[i]=i;
		}
		if(index==1 || index==2 || index==3)
		{
			
			for(j=0;j<stus.length;j++)
			{
				for(k=0;k<stus.length-j-1;k++)
				{
					if(stus[b[k]].socre[index-1]>stus[b[k+1]].socre[index-1])
					{
						l=b[k];
						b[k]=b[k+1];
						b[k+1]=l;
					}
				}
			}
		}
		if(index==4)
		{
			for(j=0;j<stus.length;j++)
			{
				for(k=0;k<stus.length-j-1;k++)
				{
					if(stus[j].sum>stus[j+1].sum)
					{
						l=b[k];
						b[k]=b[k+1];
						b[k+1]=l;
					}
				}
			}
		}
		if(index==5)
		{
			for(j=0;j<stus.length;j++)
			{
				for(k=0;k<stus.length-j-1;k++)
				{
					if(stus[k].num>stus[k+1].num)
					{
						l=b[k];
						b[k]=b[k+1];
						b[k+1]=l;
					}
				}
			}
		}
		Student[] ss=new Student[stus.length];
		for(i=0;i<stus.length;i++)
		{
			ss[i]=stus[b[i]];
		}
		
		return ss;
	}

}
