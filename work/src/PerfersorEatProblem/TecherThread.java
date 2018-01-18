package PerfersorEatProblem;

public class TecherThread extends Thread {
		
	private Choip leftchoip;
	private Choip rightchoip;
	
	public TecherThread(String name,Choip left,Choip right)
	{
		super(name);
		this.leftchoip=left;
		this.rightchoip=right;
	}
	
	

	private void pickDoubleChoip()
	{
		System.out.println(this.getName()+"������һ˫����");
		leftchoip.pickUp(this.getName());
		rightchoip.pickUp(this.getName());
		System.out.println(this.getName()+"�õ�һ˫����");
	}
	
	private void putAllChoip()
	{
		System.out.println(this.getName()+"���ڷſ���");
		leftchoip.putDown(this.getName());
		rightchoip.putDown(this.getName());
		System.out.println(this.getName()+"����һ˫����");
	}
	@Override
	public void run() {
		for(int i=0;i<1;i++)
		{
			pickDoubleChoip();
			putAllChoip();
		}
	}
}
