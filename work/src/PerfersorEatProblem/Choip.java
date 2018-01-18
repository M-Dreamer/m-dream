package PerfersorEatProblem;

public class Choip {
	
	
	private boolean choipstate=true;
	
	
	public synchronized void pickUp(String name)
	{
		if(!choipstate)
		{
			System.out.println(name+"正在准备拿一只筷子");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name+"拿到一只筷子");
		choipstate=false;
	}
	
	
	public synchronized void putDown(String name)
	{
		System.out.println(name+"放下一只筷子");
		choipstate=true;
		notifyAll();
	}

}
