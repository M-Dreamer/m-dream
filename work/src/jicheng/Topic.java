package jicheng;

public class Topic extends Tip {
	private int topicid;
	private int boardid;
	
	
	public Topic()
	{
		super();
		System.out.println("��������޲ι��췽��");
	}
	
	public Topic(String title,String content,String publishTime)
	{
		super(title,content,publishTime);
		System.out.println("��������вι��췽��");
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
		System.out.println("======������Ϣ======");
		System.out.println("���ӱ��⣺"+this.title);
		System.out.println("�������ݣ�"+this.content);
		System.out.println("����ʱ�䣺"+this.publishTime);
		System.out.println("����id: "+this.topicid);
		System.out.println("���id: "+this.boardid);
	}
	
}
