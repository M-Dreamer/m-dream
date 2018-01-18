package jicheng;

public class Tip {
	String title;
	String content;
	String publishTime;
	int uid;
	
	
	public Tip()
	{
		System.out.println("帖子类的无参构造方法");
	}
	
	
	public Tip(String title,String content,String publishTime)
	{
		System.out.println("帖子类的有参构造方法");
		this.title=title;
		this.content=content;
		this.publishTime=publishTime;
	}
	public void getInfo()
	{
		System.out.println("======帖子信息======");
		System.out.println("帖子标题："+this.title);
		System.out.println("帖子内容："+this.content);
		System.out.println("发表时间："+this.publishTime);
	}

}
