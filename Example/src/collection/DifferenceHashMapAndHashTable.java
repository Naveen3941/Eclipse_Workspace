package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DifferenceHashMapAndHashTable {

	public static void main(String[] args) {
		HashMap<Integer,String> m1=new HashMap<>();
		m1.put(1,"aaa");
		m1.put(2,null);
		m1.put(3,null);
		 for(Map.Entry<Integer, String> entry:m1.entrySet()){ 
			 System.out.println(entry.getKey()+"....."+entry.getValue());
		 }
		 
		 Hashtable<Integer,String> m2=new Hashtable<>();
			m2.put(1,"aaa");
		
			 for(Map.Entry<Integer, String> entry:m2.entrySet()){ 
				 System.out.println(entry.getKey()+"....."+entry.getValue());
			 }
			
		
		
	}

}
