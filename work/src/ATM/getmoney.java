package ATM;
import java.util.Scanner;
public class getmoney {
	
	public static void main(String args[])
	{
		int balance=1000;
		int fetchMoney,select;
		String password;
		Scanner input=new Scanner(System.in);
		System.out.println("请输入密码：");
		while(true)
		{
			password=input.next();
			if(password.equals("123456"))
			{
				while(true)
				{
					System.out.println("1.取款");
					System.out.println("2.查看余额");
					System.out.println("3.退出");
					System.out.println("请选择操作：");
					select=input.nextInt();
					switch(select)
					{
						case 1:
							System.out.println("请输入取款数额：");
							while(true)
							{
								fetchMoney=input.nextInt();
								if(fetchMoney>balance)
								{
									System.out.println("余额不足，请重新输入取款数额！");
								}
								else
								{
									System.out.println("请取取款！");
									balance=balance-fetchMoney;
									break;
								}
							}
							break;
						case 2:
							System.out.println("余额为"+balance);
							break;
						case 3:
							System.out.println("谢谢光临，祝您生活愉快！");
							return ;
					}
				}
			}
			else
			{
				System.out.println("密码错误，请重新输入！");
			}
		}
	}

}
