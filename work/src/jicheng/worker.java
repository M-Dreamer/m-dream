package jicheng;

public class worker {
	public static void main(String args[])
	{
		Tip p1=new Tip("�һ��ü̳���","����","2010-10-1 12:01:10");
		p1.getInfo();
		System.out.println("\r");
		
		Tip p2=new Tip();
		p2.title="�һ��ü̳���";
		p2.content="����";
		p2.publishTime="2010-10-1 12:02:10";
		p2.getInfo();
		System.out.println("\r");
		
		Relpy p3=new Relpy();
		p3.title="�һ��ü̳���";
		p3.content="��Ҳ��";
		p3.publishTime="2010-10-1 12:04:11";
		p3.settopicid(10);
		p3.setreplyid(1);
		p3.getInfo();
		System.out.println("\r");
		
		Tip p4=new Topic();
		p4.title="�������֣�����ָ��";
		p4.content="�Ҹտ�ʼѧjava,����ָ��";
		p4.publishTime="2010-10-2 12:00:00";
		p4.getInfo();
		System.out.println("\r");
		
		Topic p5=new Topic("�һ��ü̳�","����","2010-10-2 13:12:20");
		p5.settopicid(3);
		p5.setboardid(13);
		p5.getInfo();
	}

}
