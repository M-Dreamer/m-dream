package text;
import java.util.Scanner;
public class saw {
	public static void main(String args[])
	{
		int i,j,k,l,m,n;
		Scanner input=new Scanner(System.in);
		System.out.println("输入学生人数:");
		n=input.nextInt();
		String name[]=new String[n];
		
		int socre[][]=new int[n][3];
		for(i=0;i<name.length;i++)
		{
			System.out.println("输入第"+(i+1)+"位学生姓名：");
			name[i]=input.next();
			System.out.println("请输入三门分数：");
			for(j=0;j<3;j++)
			{
				while(true)
				{
					socre[i][j]=input.nextInt();
					if(socre[i][j]>0 && socre[i][j]<100)
						break;
					else
						System.out.println("数据错误，请重输！");
				}
			}
		}
		System.out.println("显示所有信息：");
		System.out.println("编号\t"+"姓名\t"+"课程1\t"+"课程2\t"+"课程3\t"+"总分");
		for(k=0;k<name.length;k++)
		{
			System.out.println(k+"\t"+name[k]+"\t"+  socre[k][0]+"\t"+  socre[k][1]+"\t"+  socre[k][2]+"\t"+(socre[k][0]+socre[k][1]+socre[k][2]));
		}
		while(true)
		{
			System.out.println("操作选项");
			System.out.println("1.修改数据");
			System.out.println("2.排序");
			System.out.println("3.退出");
			System.out.println("请选择操作: ");
			l=input.nextInt();
			switch(l)
			{
				case 1:
					System.out.println("请输入编号：");
					m=input.nextInt();
					System.out.println("编号\t"+"姓名\t"+"课程1\t"+"课程2\t"+"课程3\t"+"总分");
					System.out.println(m+"\t"+name[m]+"\t"+  socre[m][0]+"\t"+  socre[m][1]+"\t"+  socre[m][2]+ "\t" +(socre[m][0]+socre[m][1]+socre[m][2]));
					System.out.println("输入修改数据：");
					System.out.println("姓名：");
					name[m]=input.next();
					System.out.println("三门成绩：");
					for(i=0;i<3;i++)
					{
						socre[m][i]=input.nextInt();
					}
					System.out.println("显示修改后的所有信息：");
					System.out.println("编号\t"+"姓名\t"+"课程1\t"+"课程2\t"+"课程3\t"+"总分");
					for(k=0;k<name.length;k++)
					{
						System.out.println(k+"\t"+name[k]+"\t"+  socre[k][0]+"\t"+  socre[k][1]+"\t"+  socre[k][2]+ "\t" +(socre[k][0]+socre[k][1]+socre[k][2]));
					}
					break;
				case 2:
					System.out.println("1.按照课程1");
					System.out.println("2.按照课程2");
					System.out.println("3.按照课程3");
					System.out.println("4.按照总分");
					System.out.println("5.返回上层");
					System.out.println("请选择排序条件（降序）：");
					int a=input.nextInt();
					int b[]=new int[n];
					for(i=0;i<n;i++)
						b[i]=i;
					switch(a)
					{
						case 1:
							for(i=0;i<n;i++)
							{
								for(j=0;j<n-1-i;j++)
								{
									if(socre[b[j]][0]<socre[b[j+1]][0])
									{
										int tem;
										tem=b[j];
										b[j]=b[j+1];
										b[j+1]=tem;
									}
								}
							}
							System.out.println("编号\t"+"姓名\t"+"课程1\t"+"课程2\t"+"课程3\t"+"总分");
							for(k=0;k<name.length;k++)
							{
								System.out.println(b[k]+"\t"+name[b[k]]+"\t"+  socre[b[k]][0]+"\t"+  socre[b[k]][1]+"\t"+  socre[b[k]][2]+ "\t" +(socre[b[k]][0]+socre[b[k]][1]+socre[b[k]][2]));
							}
							break;
						case 2:
							for(i=0;i<n;i++)
							{
								for(j=0;j<n-1-i;j++)
								{
									if(socre[b[j]][1]<socre[b[j+1]][1])
									{
										int tem;
										tem=b[j];
										b[j]=b[j+1];
										b[j+1]=tem;
									}
								}
							}
							System.out.println("编号\t"+"姓名\t"+"课程1\t"+"课程2\t"+"课程3\t"+"总分");
							for(k=0;k<name.length;k++)
							{
								System.out.println(b[k]+"\t"+name[b[k]]+"\t"+  socre[b[k]][0]+"\t"+  socre[b[k]][1]+"\t"+  socre[b[k]][2]+ "\t" +(socre[b[k]][0]+socre[b[k]][1]+socre[b[k]][2]));
							}
							break;
						case 3:
							for(i=0;i<n;i++)
							{
								for(j=0;j<n-1-i;j++)
								{
									if(socre[b[j]][2]<socre[b[j+1]][2])
									{
										int tem;
										tem=b[j];
										b[j]=b[j+1];
										b[j+1]=tem;
									}
								}
							}
							System.out.println("编号\t"+"姓名\t"+"课程1\t"+"课程2\t"+"课程3\t"+"总分");
							for(k=0;k<name.length;k++)
							{
								System.out.println(b[k]+"\t"+name[b[k]]+"\t"+  socre[b[k]][0]+"\t"+  socre[b[k]][1]+"\t"+  socre[b[k]][2]+ "\t" +(socre[b[k]][0]+socre[b[k]][1]+socre[b[k]][2]));
							}
							break;
						case 4:
							for(i=0;i<n;i++)
							{
								for(j=0;j<n-1-i;j++)
								{
									if((socre[b[j]][0]+socre[b[j]][1]+socre[b[j]][2])<(socre[b[j+1]][0]+socre[b[j+1]][1]+socre[b[j+1]][2]))
									{
										int tem;
										tem=b[j];
										b[j]=b[j+1];
										b[j+1]=tem;
									}
								}
							}
							System.out.println("编号\t"+"姓名\t"+"课程1\t"+"课程2\t"+"课程3\t"+"总分");
							for(k=0;k<name.length;k++)
							{
								System.out.println(b[k]+"\t"+name[b[k]]+"\t"+  socre[b[k]][0]+"\t"+  socre[b[k]][1]+"\t"+  socre[b[k]][2]+ "\t" +(socre[b[k]][0]+socre[b[k]][1]+socre[b[k]][2]));
							}
							break;
						case 5:
							break;
					}
					break;
				case 3:
					return ;
				
			}
		}
	}
}
