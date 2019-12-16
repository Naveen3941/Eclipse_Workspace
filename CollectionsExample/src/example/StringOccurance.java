package example;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class StringOccurance {

	public static void main(String[] args) {
     String a[]= {"kranthi","ram","sai","jagu","sai","kranthi","sai","ram","kk","ram","lo","ram"};
     List<String> l1=Arrays.asList(a);
     HashSet<String> h1=new HashSet<String>(l1);
     for(String s:h1)
     {
    	 System.out.println(s+"...."+Collections.frequency(l1, s));
    	
     }
     

	}

}
