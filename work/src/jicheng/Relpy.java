package jicheng;

public class Relpy extends Tip{
	private int replyid;
	private int topicid;
	
	public void settopicid(int topicid)
	{
		this.topicid=topicid;
	}
	
	public void setreplyid(int replyid)
	{
		this.replyid=replyid;
	}
	
	public int gettopicid()
	{
		return this.topicid;
	}
	
	public int getreplyid()
	{
		return this.replyid;
	}
	
	
	public void getInfo()
	{
		System.out.println("======回复信息======");
		System.out.println("帖子标题：reply:"+this.title);
		System.out.println("帖子内容："+this.content);
		System.out.println("发表时间："+this.publishTime);
		System.out.println("主题id: "+this.topicid);
		System.out.println("回复id: "+this.replyid);
	}

}
