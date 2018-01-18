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
		return "������"+this.name+"����"+this.age+"סַ:"+this.address;
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof UserInfo)
		{
			UserInfo u=(UserInfo)o;
			//System.out.println("object ת   UserInfo �ɹ���");
			return this.age-u.age;
		}
		return 0;
	}

}
