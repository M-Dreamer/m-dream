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
		System.out.println("======�ظ���Ϣ======");
		System.out.println("���ӱ��⣺reply:"+this.title);
		System.out.println("�������ݣ�"+this.content);
		System.out.println("����ʱ�䣺"+this.publishTime);
		System.out.println("����id: "+this.topicid);
		System.out.println("�ظ�id: "+this.replyid);
	}

}
