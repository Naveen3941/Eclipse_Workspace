package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FrequencyTest {

	public static void main(String[] args) {
		
		
		String a="asdhfbvhgbasdcbvhfrutyghqovwefsteredf";
		
		List<String> l1=new ArrayList<>(); 
		Set<String> l2=new HashSet<>();
;		for(int i=0;i<a.length();i++)
		{
			
			l1.add(a.substring(i,i+1));
			l2.add(a.substring(i,i+1));
		}
for(String s:l2)
{ 
	int m=Collections.frequency(l1, s);
	System.out.println(s+"---------------------"+Collections.frequency(l1, s));
	if(m>1)
	{
		System.out.println();
	}
	
}
		
        System.out.println(l1);
        System.out.println("...................................");
        System.out.println(l2);
	}

}
