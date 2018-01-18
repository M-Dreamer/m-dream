package text;

public class Demo {
	public static void main(String[] args) {
		Double d=new Double(26);
		String s=Double.toHexString(d);
		System.out.println(s);
		Integer i=new Integer(10);
		String s1=Integer.toBinaryString(i);
		System.out.println(s1);
		s1=Integer.toHexString(i);
		System.out.println(s1);
		s1=Integer.toOctalString(i);
		System.out.println(s1);
		s1=Float.toHexString((float)i);
		System.out.println(s1);
		System.out.println((float)i);
	}
	
	
}
