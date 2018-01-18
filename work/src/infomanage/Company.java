package infomanage;

public class Company {
	Employee[] emp=new Employee[100];
	int count=0;
	public  Company()
	{
		
	}
	public Company(String ename,int eid,int eage,float salary)
	{
		Employee ss =new Employee();
		ss.setname(ename);
		ss.setid(eid);
		ss.setage(eage);
		ss.setsalary(salary);
		emp[count]=ss;
		count++;
	}
}
