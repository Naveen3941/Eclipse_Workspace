package example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class CountNumberOfWords {

	public static void main(String[] args) {
	String s="This is is an Technical issue for an SSM Team";
	String s1[]=s.split(" ");
	List<String> l2=Arrays.asList(s1);
	LinkedHashSet<String> l1=new LinkedHashSet<>(l2);
	System.out.println("hai");
	int i=0;
	for(String m:l1)
	{
	System.out.println(m+"....."+Collections.frequency(l2, m));
	//System.out.println("hai");
	i++;
	}
	}

}
