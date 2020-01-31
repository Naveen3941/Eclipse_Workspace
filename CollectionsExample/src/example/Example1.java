package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("aaa");
		l1.add("bbb");
		l1.add("bbb");
		Collections.fill(l1, "kl");
		
		for(String m:l1)
		{
			System.out.println(m);
		}
	}

}
