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
		shangping.put("ƻ��", 100);
		shangping.put("�㽶", 100);
		shangping.put("����", 100);
		shangping.put("����", 100);
		shangping.put("����", 100);
		shangping.put("����", 100);
		
		
	}
	
		public static void main(String[] args) {
			System.out.println("����ѡ�񡣡�����������");
			System.out.println("1.��¼");
			System.out.println("2.ע��");
			Scanner input=new Scanner(System.in);
			System.out.print("ѡ�������");
			int i=input.nextInt();
			while(true)
			{
				switch(i)
				{
					case 1:
						if(denglu())
						{
							System.out.println("��ӭ����ˮ���ꡣ��������������");
							while(true)
							{
								System.out.println("��ѡ���ܡ�������������");
								System.out.println("1.��ʾ��Ʒ");
								System.out.println("2.ѡ����Ʒ");
								System.out.println("3.�鿴���ﳵ");
								System.out.println("4.��������");
								
								int selctnum=input.nextInt();
								switch(selctnum)
								{
									case 1:
										System.out.println("��Ʒ�С�����������");
										display(shangping);
										break;
									case 2:
										System.out.print("������Ʒ����������");
										String ssname=input.next();
										int kkg=input.nextInt();
										select(ssname,kkg);
										break;
									case 3:
										System.out.println("���ﳵ���С�����������");
										display(usersale);
										break;
									case 4:
										System.out.println("лл�ݹˣ���ӭ�´ι��٣�");
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
							System.out.println("��ӭ����ˮ���ꡣ��������������");
							while(true)
							{
								System.out.println("��ѡ���ܡ�������������");
								System.out.println("1.��ʾ��Ʒ");
								System.out.println("2.ѡ����Ʒ");
								System.out.println("3.�鿴���ﳵ");
								System.out.println("4.��������");
								int selctnum=input.nextInt();
								switch(selctnum)
								{
									case 1:
										System.out.println("��Ʒ�С�����������");
										display(shangping);
										break;
									case 2:
										System.out.print("������Ʒ����������");
										String ssname=input.next();
										int kkg=input.nextInt();
										select(ssname,kkg);
										break;
									case 3:
										System.out.println("���ﳵ���С�������������");
										display(usersale);
										break;
									case 4:
										System.out.println("лл�ݹˣ���ӭ�´ι��٣�");
										return ;
								}
							}
						}
						else
						{
							System.out.println("������ע��");
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
					System.out.println("��¼�ɹ�");
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
				System.out.println("ע��ɹ�");
				return true;
			}
			else
			{
				System.out.println("�û��Ѵ���");
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
					System.out.println(sname+"��������");
				}
			}
			else
			{
				System.out.println("û�д���Ʒ");
			}
			
		}
}
