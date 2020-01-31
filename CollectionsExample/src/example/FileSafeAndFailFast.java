package example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FileSafeAndFailFast {

	public static void main(String[] args) {
          Integer a=153;
          System.out.println(a.reverse(1));
          String b=String.valueOf(a);
          System.out.println(b);
		List<String> l1=new CopyOnWriteArrayList<>();
		l1.add("aaa");
		l1.add("bbb");
		l1.add("ccc");
		Iterator<String> i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			l1.add("ddd");
		}
		
	}

}
