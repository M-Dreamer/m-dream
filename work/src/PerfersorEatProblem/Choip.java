package PerfersorEatProblem;

public class Choip {
	
	
	private boolean choipstate=true;
	
	
	public synchronized void pickUp(String name)
	{
		if(!choipstate)
		{
			System.out.println(name+"����׼����һֻ����");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name+"�õ�һֻ����");
		choipstate=false;
	}
	
	
	public synchronized void putDown(String name)
	{
		System.out.println(name+"����һֻ����");
		choipstate=true;
		notifyAll();
	}

}
