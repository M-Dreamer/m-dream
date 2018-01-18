package Animal;
import java.util.Scanner;
public class Test {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		Test ss=new Test();
		Zoo zoo=new Zoo();
		int count=0; 
		int num,i;
		while(true)
		{
			System.out.println("1.添加动物");
			System.out.println("2.退出");
			System.out.println("请选择操作：");
			num=input.nextInt();
			switch(num)
			{
				case 1:
					System.out.println("请输入添加动物的数量：");
					num=input.nextInt();
					for(i=count;i<count+num;i++)
					{
						System.out.println("请输入第"+(i+1)+"组信息：");
						zoo.ans[i]=ss.add();
					}
					count=count+num;
					System.out.println("name\t"+"age\t"+"color\t");
					for(i=0;i<count;i++)
					{
						
						System.out.println(zoo.ans[i].name+"\t"+zoo.ans[i].age+"\t"+zoo.ans[i].color);
					}
					break;
				case 2:
					return;
			}
		}
	}
	public Animal add()
	{
		String name;
		int age;
		String color;
		Scanner input=new Scanner(System.in);
		System.out.println("animal's name:");
		name=input.next();
		System.out.println("animal's age:");
		age=input.nextInt();
		System.out.println("animal's color:");
		color=input.next();
		Animal ans=new Animal(name,age,color);
		return ans;
	}
	
	
}
