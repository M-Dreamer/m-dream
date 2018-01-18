package jicheng;

public class Topic extends Tip {
	private int topicid;
	private int boardid;
	
	
	public Topic()
	{
		super();
		System.out.println("主题类的无参构造方法");
	}
	
	public Topic(String title,String content,String publishTime)
	{
		super(title,content,publishTime);
		System.out.println("主题类的有参构造方法");
	}
	public void settopicid(int topicid)
	{
		this.topicid=topicid;
	}
	
	public void setboardid(int boardid)
	{
		this.boardid=boardid;
	}
	
	public int gettopicid()
	{
		return this.topicid;
	}
	
	public int getboardid()
	{
		return this.boardid;
	}
	
	public void getInfo()
	{
		System.out.println("======主题信息======");
		System.out.println("帖子标题："+this.title);
		System.out.println("帖子内容："+this.content);
		System.out.println("发表时间："+this.publishTime);
		System.out.println("主题id: "+this.topicid);
		System.out.println("板块id: "+this.boardid);
	}
	
}
