package Manager;
import java.util.Scanner;
public class Maneger {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int i,j,k;
		System.out.println("ѧ��������");
		i=input.nextInt();
		String name[]=new String[i];
		//String name1;
		int socre[][]=new int[i][3];
		for(j=0;j<i;j++)
		{
			System.out.println("�����"+(j+1)+"��ѧ��������");
			//name1=ss.inputname();
			name[i]=input.nextLine();
			for(k=0;k<3;k++)
			{
				System.out.println("���������ſγ̵ķ�����");
				socre[i][k]=input.nextInt();
			}
		}
		System.out.println("��ʾ������Ϣ��");
		System.out.println("���\t"+"����\t"+"socre1\t"+"socre2\t"+"socre3");
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
				System.out.println("�����������������");
			}
			else
				break;
			
		}
		return socre;
	}

}
