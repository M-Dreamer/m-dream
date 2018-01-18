package infomanage;

public class Employee {
	int eid;
	String ename;
	int eage;
	float salary;
	
	public void setname(String ename)
	{
		this.ename=ename;
	}
	
	public String getname()
	{
		return this.ename;
	}
	public void setage(int eage)
	{
		this.eage=eage;
	}
	
	public int getage()
	{
		return this.eage;
	}
	public void setsalary(float salary)
	{
		this.salary=salary;
	}
	
	public float getsalary()
	{
		return this.salary;
	}
	public void setid(int eid)
	{
		this.eid=eid;
	}
	
	public int getid()
	{
		return this.eid;
	}
}
