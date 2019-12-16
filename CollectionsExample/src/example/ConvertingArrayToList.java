package example;

import java.util.ArrayList;
import java.util.List;

public class ConvertingArrayToList {

	public static void main(String[] args) {

    List<String> l1=new ArrayList<>();
      l1.add("aaa");
      l1.add("baa");
      l1.add("caa");
      l1.add("daa");
      
      String a[]=new String[l1.size()];
    		  a=l1.toArray(a);
    for(String b:a)
    {
    	System.out.println(b);
    }
	}

}
