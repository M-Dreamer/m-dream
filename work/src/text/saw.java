package text;
import java.util.Scanner;
public class saw {
	public static void main(String args[])
	{
		int i,j,k,l,m,n;
		Scanner input=new Scanner(System.in);
		System.out.println("����ѧ������:");
		n=input.nextInt();
		String name[]=new String[n];
		
		int socre[][]=new int[n][3];
		for(i=0;i<name.length;i++)
		{
			System.out.println("�����"+(i+1)+"λѧ��������");
			name[i]=input.next();
			System.out.println("���������ŷ�����");
			for(j=0;j<3;j++)
			{
				while(true)
				{
					socre[i][j]=input.nextInt();
					if(socre[i][j]>0 && socre[i][j]<100)
						break;
					else
						System.out.println("���ݴ��������䣡");
				}
			}
		}
		System.out.println("��ʾ������Ϣ��");
		System.out.println("���\t"+"����\t"+"�γ�1\t"+"�γ�2\t"+"�γ�3\t"+"�ܷ�");
		for(k=0;k<name.length;k++)
		{
			System.out.println(k+"\t"+name[k]+"\t"+  socre[k][0]+"\t"+  socre[k][1]+"\t"+  socre[k][2]+"\t"+(socre[k][0]+socre[k][1]+socre[k][2]));
		}
		while(true)
		{
			System.out.println("����ѡ��");
			System.out.println("1.�޸�����");
			System.out.println("2.����");
			System.out.println("3.�˳�");
			System.out.println("��ѡ�����: ");
			l=input.nextInt();
			switch(l)
			{
				case 1:
					System.out.println("�������ţ�");
					m=input.nextInt();
					System.out.println("���\t"+"����\t"+"�γ�1\t"+"�γ�2\t"+"�γ�3\t"+"�ܷ�");
					System.out.println(m+"\t"+name[m]+"\t"+  socre[m][0]+"\t"+  socre[m][1]+"\t"+  socre[m][2]+ "\t" +(socre[m][0]+socre[m][1]+socre[m][2]));
					System.out.println("�����޸����ݣ�");
					System.out.println("������");
					name[m]=input.next();
					System.out.println("���ųɼ���");
					for(i=0;i<3;i++)
					{
						socre[m][i]=input.nextInt();
					}
					System.out.println("��ʾ�޸ĺ��������Ϣ��");
					System.out.println("���\t"+"����\t"+"�γ�1\t"+"�γ�2\t"+"�γ�3\t"+"�ܷ�");
					for(k=0;k<name.length;k++)
					{
						System.out.println(k+"\t"+name[k]+"\t"+  socre[k][0]+"\t"+  socre[k][1]+"\t"+  socre[k][2]+ "\t" +(socre[k][0]+socre[k][1]+socre[k][2]));
					}
					break;
				case 2:
					System.out.println("1.���տγ�1");
					System.out.println("2.���տγ�2");
					System.out.println("3.���տγ�3");
					System.out.println("4.�����ܷ�");
					System.out.println("5.�����ϲ�");
					System.out.println("��ѡ���������������򣩣�");
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
							System.out.println("���\t"+"����\t"+"�γ�1\t"+"�γ�2\t"+"�γ�3\t"+"�ܷ�");
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
							System.out.println("���\t"+"����\t"+"�γ�1\t"+"�γ�2\t"+"�γ�3\t"+"�ܷ�");
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
							System.out.println("���\t"+"����\t"+"�γ�1\t"+"�γ�2\t"+"�γ�3\t"+"�ܷ�");
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
							System.out.println("���\t"+"����\t"+"�γ�1\t"+"�γ�2\t"+"�γ�3\t"+"�ܷ�");
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
