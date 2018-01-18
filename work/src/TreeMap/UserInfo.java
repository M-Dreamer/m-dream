package TreeMap;

@SuppressWarnings("rawtypes")
public class UserInfo implements Comparable{
	private String name;
	private int age;
	private String address;
	
	public UserInfo(String name,int age,String address)
	{
		super();
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString()
	{
		return "姓名："+this.name+"年龄"+this.age+"住址:"+this.address;
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof UserInfo)
		{
			UserInfo u=(UserInfo)o;
			//System.out.println("object 转   UserInfo 成功！");
			return this.age-u.age;
		}
		return 0;
	}

}
