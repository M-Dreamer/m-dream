package jicheng;

public class Tip {
	String title;
	String content;
	String publishTime;
	int uid;
	
	
	public Tip()
	{
		System.out.println("��������޲ι��췽��");
	}
	
	
	public Tip(String title,String content,String publishTime)
	{
		System.out.println("��������вι��췽��");
		this.title=title;
		this.content=content;
		this.publishTime=publishTime;
	}
	public void getInfo()
	{
		System.out.println("======������Ϣ======");
		System.out.println("���ӱ��⣺"+this.title);
		System.out.println("�������ݣ�"+this.content);
		System.out.println("����ʱ�䣺"+this.publishTime);
	}

}
