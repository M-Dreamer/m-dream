package studentmanage;

public class Student {
	String no;
	String name;
	int age;
	String sex;
	String mobile;
	String address;
	
	
	public Student()
	{
		
	}
	
	public Student(String no,String name,int age,String sex,String mobile,String address)
	{
		this.no=no;
		this.name=name;
		this.address=address;
		this.age=age;
		this.sex=sex;
		this.mobile=mobile;
	}
	
	public Student(String no,String name,int age,String sex)
	{
		this.no=no;
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	
	public void eat()
	{
		System.out.println(this.name+"在吃饭");
	}
	
	
	public void study()
	{
		System.out.println(this.name+"在学习");
	}
	
	
	public void sleep()
	{
		System.out.println(this.name+"在睡觉");
	}
	
	
	public void display()
	{
		System.out.println("学号\t"+"\t姓名\t"+ "年龄\t" + "性别\t"+  "联系电话\t"+ "\t联系地址\t");
		System.out.println(this.no+"\t"+this.name+"\t"+this.age+"\t"+this.sex+"\t"+this.mobile+"\t"+this.address);
	}

}
