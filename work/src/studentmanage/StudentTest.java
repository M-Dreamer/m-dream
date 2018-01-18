package studentmanage;

public class StudentTest {
	public static void main(String[] args)
	{
		Student stus=new Student("newer001","李国栋",23,"男","1389876188","湖南省长沙市五一大道108号");
		stus.display();
		System.out.println("\r");
		stus.eat();
		System.out.println("\r");
		stus.study();
		System.out.println("\r");
		stus.sleep();
	}
}
