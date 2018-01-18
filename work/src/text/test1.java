package text;

public class test1 {
	public static void main(String[] args) {
		Integer i=new Integer(-6);
		String s=Integer.toBinaryString(i);
		System.out.println(s);
		i=6;
		s=Integer.toBinaryString(i);
		System.out.println(s);
		int a=3,b;
		b=a++;
		System.out.println(b+" "+a);
		b=++a;
		System.out.println(b+" "+a);
	}
}
