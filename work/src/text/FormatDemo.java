package text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDemo {
	
	public static void test1()
	{
		//参数字符串表示日期的格式:xxxx年xx月xx日
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日  HH点mm分ss秒  E Z");
		//将日期转换成指定格式的字符串
		Date today=new Date();
		//将日期对象格式化成字符串
		String s=sdf.format(today);
		System.out.println(s);
		
		String t="今天是   20101111";
		char ss=t.charAt(2);
		System.out.println(ss);
		StringBuffer s1=new StringBuffer("今天是  11112010");
		String t1=s1.toString();
		SimpleDateFormat sdf2=new SimpleDateFormat("今天是  MMddyyyy");
		//将字符串转换成日期
		try {
			Date d2=sdf2.parse(t1);
			System.out.println("转换成功: "+d2.toLocaleString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		test1();
	}
}

