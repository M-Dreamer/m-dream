package TreeMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class SaleTest {
	
	static HashMap<String,String> user=new HashMap<String,String>();
	static HashMap<String,Integer> shangping=new HashMap<String,Integer>();
	static HashMap<String,Integer> usersale=new HashMap<String,Integer>();
	
	static{
		user.put("user", "1234");
		shangping.put("苹果", 100);
		shangping.put("香蕉", 100);
		shangping.put("橘子", 100);
		shangping.put("柿子", 100);
		shangping.put("梨子", 100);
		shangping.put("栗子", 100);
		
		
	}
	
		public static void main(String[] args) {
			System.out.println("功能选择。。。。。。。");
			System.out.println("1.登录");
			System.out.println("2.注册");
			Scanner input=new Scanner(System.in);
			System.out.print("选择操作：");
			int i=input.nextInt();
			while(true)
			{
				switch(i)
				{
					case 1:
						if(denglu())
						{
							System.out.println("欢迎光临水果店。。。。。。。。");
							while(true)
							{
								System.out.println("请选择功能。。。。。。。");
								System.out.println("1.显示商品");
								System.out.println("2.选择商品");
								System.out.println("3.查看购物车");
								System.out.println("4.结束购物");
								
								int selctnum=input.nextInt();
								switch(selctnum)
								{
									case 1:
										System.out.println("商品有。。。。。。");
										display(shangping);
										break;
									case 2:
										System.out.print("输入商品名及数量：");
										String ssname=input.next();
										int kkg=input.nextInt();
										select(ssname,kkg);
										break;
									case 3:
										System.out.println("购物车里有。。。。。。");
										display(usersale);
										break;
									case 4:
										System.out.println("谢谢惠顾，欢迎下次光临！");
										return ;
								}
							}
						}
						else
						{
							System.out.println("please login agin");
						}
						break;
					case 2:
						if(zhuce())
						{
							System.out.println("欢迎光临水果店。。。。。。。。");
							while(true)
							{
								System.out.println("请选择功能。。。。。。。");
								System.out.println("1.显示商品");
								System.out.println("2.选择商品");
								System.out.println("3.查看购物车");
								System.out.println("4.结束购物");
								int selctnum=input.nextInt();
								switch(selctnum)
								{
									case 1:
										System.out.println("商品有。。。。。。");
										display(shangping);
										break;
									case 2:
										System.out.print("输入商品名及数量：");
										String ssname=input.next();
										int kkg=input.nextInt();
										select(ssname,kkg);
										break;
									case 3:
										System.out.println("购物车里有。。。。。。。");
										display(usersale);
										break;
									case 4:
										System.out.println("谢谢惠顾，欢迎下次光临！");
										return ;
								}
							}
						}
						else
						{
							System.out.println("请重新注册");
						}
						break;
				}
			}
			
		}
		
		private static void whlie(boolean b) {
			// TODO Auto-generated method stub
			
		}

		public static boolean denglu()
		{
			Scanner input=new Scanner(System.in);
			System.out.print("please input username:");
			String name=input.next();
			System.out.print("please input password:");
			String password=input.next();
			if(user.containsKey(name))
			{
				String spassword=user.get(name);
				
				if(password.equals(spassword))
				{
					System.out.println("登录成功");
					return true;
				}
				else
				{
					System.out.println("password error");
					return false;
				}
			}
			else
			{
				System.out.println("username error");
				return false;
			}
		}
		
		public static boolean zhuce()
		{
			Scanner input=new Scanner(System.in);
			System.out.print("please input username:");
			String name=input.next();
			System.out.print("please input password:");
			String password=input.next();
			if(!user.containsKey(name))
			{
				user.put(name, password);
				System.out.println("注册成功");
				return true;
			}
			else
			{
				System.out.println("用户已存在");
				return false;
			}
				
		}
		
		public static void display(HashMap hashmap)
		{
			Set imtes=hashmap.entrySet();
			Iterator its=imtes.iterator();
			while(its.hasNext())
			{
				Entry entry=(Entry)its.next();
				System.out.println(entry.getKey()+"---------"+entry.getValue()+"kg");
			}
		}
		
		public static void select(String sname,int kg)
		{
			HashMap hashmap=new HashMap();
			if(shangping.containsKey(sname))
			{
				int skg=shangping.get(sname);
				if(kg<skg)
				{
					if(usersale.containsKey(sname))
					{
						int count=usersale.get(sname);
						usersale.put(sname, count+kg);
					}
					else
					{
						usersale.put(sname, kg);
						shangping.put(sname,skg-kg);
					}
				}
				else
				{
					System.out.println(sname+"数量不足");
				}
			}
			else
			{
				System.out.println("没有此商品");
			}
			
		}
}
