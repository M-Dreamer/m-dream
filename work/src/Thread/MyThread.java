package Thread;

public class MyThread extends Thread{
	private static int total=100;
	
	
	public MyThread(String name)
	{
		super(name);
	}
	
	
	public synchronized void run()
	{
		
		synchronized (this) {
			String name=getName();
			while(total>0)
			{
				System.out.println(name+"��������"+(101-total)+"��Ʊ");
				total--;
			}
			
		}
		
			
	}

}
