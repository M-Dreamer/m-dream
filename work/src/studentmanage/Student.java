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
		System.out.println(this.name+"�ڳԷ�");
	}
	
	
	public void study()
	{
		System.out.println(this.name+"��ѧϰ");
	}
	
	
	public void sleep()
	{
		System.out.println(this.name+"��˯��");
	}
	
	
	public void display()
	{
		System.out.println("ѧ��\t"+"\t����\t"+ "����\t" + "�Ա�\t"+  "��ϵ�绰\t"+ "\t��ϵ��ַ\t");
		System.out.println(this.no+"\t"+this.name+"\t"+this.age+"\t"+this.sex+"\t"+this.mobile+"\t"+this.address);
	}

}
