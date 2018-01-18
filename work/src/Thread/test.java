package Thread;

public class test {
	public static void main(String args[])
	{
		String name=Thread.currentThread().getName();
		System.out.println(name);
		MyThread t1=new MyThread("w1");
	    MyThread t2=new MyThread("d1");
		MyThread t3=new MyThread("f1");
		MyThread t4=new MyThread("g1");
		t1.start();
		System.out.println("thread main finished");
		t2.start();
		System.out.println("thread main finished");
		t3.start();
		System.out.println("thread main finished");
		t4.start();
		
//		SaleTicket smak=new SaleTicket();
//		Thread t1=new Thread(smak,"qw");
//		Thread t2=new Thread(smak,"er");
//		Thread t3=new Thread(smak,"ty");
//		Thread t4=new Thread(smak,"ui");
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
		System.out.println("thread main finished");
	}

}
