package text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDemo {
	
	public static void test1()
	{
		//�����ַ�����ʾ���ڵĸ�ʽ:xxxx��xx��xx��
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��  HH��mm��ss��  E Z");
		//������ת����ָ����ʽ���ַ���
		Date today=new Date();
		//�����ڶ����ʽ�����ַ���
		String s=sdf.format(today);
		System.out.println(s);
		
		String t="������   20101111";
		char ss=t.charAt(2);
		System.out.println(ss);
		StringBuffer s1=new StringBuffer("������  11112010");
		String t1=s1.toString();
		SimpleDateFormat sdf2=new SimpleDateFormat("������  MMddyyyy");
		//���ַ���ת��������
		try {
			Date d2=sdf2.parse(t1);
			System.out.println("ת���ɹ�: "+d2.toLocaleString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		test1();
	}
}

