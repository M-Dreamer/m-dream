package jicheng;

public class worker {
	public static void main(String args[])
	{
		Tip p1=new Tip("我会用继承了","如题","2010-10-1 12:01:10");
		p1.getInfo();
		System.out.println("\r");
		
		Tip p2=new Tip();
		p2.title="我会用继承了";
		p2.content="如题";
		p2.publishTime="2010-10-1 12:02:10";
		p2.getInfo();
		System.out.println("\r");
		
		Relpy p3=new Relpy();
		p3.title="我会用继承了";
		p3.content="俺也会";
		p3.publishTime="2010-10-1 12:04:11";
		p3.settopicid(10);
		p3.setreplyid(1);
		p3.getInfo();
		System.out.println("\r");
		
		Tip p4=new Topic();
		p4.title="我是新手，请大家指教";
		p4.content="我刚开始学java,请大家指教";
		p4.publishTime="2010-10-2 12:00:00";
		p4.getInfo();
		System.out.println("\r");
		
		Topic p5=new Topic("我会用继承","如题","2010-10-2 13:12:20");
		p5.settopicid(3);
		p5.setboardid(13);
		p5.getInfo();
	}

}
