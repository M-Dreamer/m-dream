package ATM;
import java.util.Scanner;
public class getmoney {
	
	public static void main(String args[])
	{
		int balance=1000;
		int fetchMoney,select;
		String password;
		Scanner input=new Scanner(System.in);
		System.out.println("���������룺");
		while(true)
		{
			password=input.next();
			if(password.equals("123456"))
			{
				while(true)
				{
					System.out.println("1.ȡ��");
					System.out.println("2.�鿴���");
					System.out.println("3.�˳�");
					System.out.println("��ѡ�������");
					select=input.nextInt();
					switch(select)
					{
						case 1:
							System.out.println("������ȡ�����");
							while(true)
							{
								fetchMoney=input.nextInt();
								if(fetchMoney>balance)
								{
									System.out.println("���㣬����������ȡ�����");
								}
								else
								{
									System.out.println("��ȡȡ�");
									balance=balance-fetchMoney;
									break;
								}
							}
							break;
						case 2:
							System.out.println("���Ϊ"+balance);
							break;
						case 3:
							System.out.println("лл���٣�ף��������죡");
							return ;
					}
				}
			}
			else
			{
				System.out.println("����������������룡");
			}
		}
	}

}
