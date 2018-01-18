package Thread;

import org.omg.CORBA.Current;

public class SaleTicket implements Runnable {
	private static int total=100;
	@Override
	public  void run() {
		// TODO Auto-generated method stu
//		private byte[] lock=new byte[0];
		String name=Thread.currentThread().getName();
		//synchronized(this){
		while(total>0)
		{
			System.out.println(name+"正在卖第"+(101-total)+"张票");
			total--;
		}
		//}
	}
	

}
