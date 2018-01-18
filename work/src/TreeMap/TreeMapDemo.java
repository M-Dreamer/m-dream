package TreeMap;


import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args ) {
		test();
		
	}
	
	public static void test()
	{
		TreeMap map=new TreeMap();
		map.put(new UserInfo("s10",12,"changsha"), 10);
		map.put(new UserInfo("s11",24,"changsha"), 100);
		map.put(new UserInfo("s12",15,"changsha"), 100);
		map.put(new UserInfo("s13",14,"changsha"), 110);
		map.put(new UserInfo("s14",18,"changsha"), 90);
		map.put(new UserInfo("s15",12,"changsha"), 80);
		
		Set imtes=map.keySet();
		Iterator its=imtes.iterator();
		while(its.hasNext())
		{
			Entry key=(Entry)its.next();
			
			
			System.out.println(key.getKey()+" "+key.getValue());
		}
	}
	
}
