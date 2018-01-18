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
		System.out.println(this.getName()+"正在拿一双筷子");
		leftchoip.pickUp(this.getName());
		rightchoip.pickUp(this.getName());
		System.out.println(this.getName()+"拿到一双筷子");
	}
	
	private void putAllChoip()
	{
		System.out.println(this.getName()+"正在放筷子");
		leftchoip.putDown(this.getName());
		rightchoip.putDown(this.getName());
		System.out.println(this.getName()+"放下一双筷子");
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
