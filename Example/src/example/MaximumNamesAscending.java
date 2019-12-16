package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MaximumNamesAscending {

	public static void main(String[] args) {
		System.out.println("mmmmmmmm");
		List<String> l1=new ArrayList<String>();
		l1.add("system");
		l1.add("admin");
		l1.add("it");
		l1.add("system");
		l1.add("it");
		l1.add("network");
		HashSet<String> l2=new HashSet<>(l1);
		
		for(String s:l2) {
			System.out.println(s+"   "+Collections.frequency(l1, s));
		}
	}

}
