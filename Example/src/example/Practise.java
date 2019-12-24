package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practise {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 7, 2, 3, 8, 9, 3, 11, 12, 11 };
		Integer res[]= {2,7,6};
		Integer res1[]= {1,8,9};
		Integer res2[]= {9,9,8};
         List<Integer> l1=new ArrayList<>();	
         Collections.addAll(l1,res);
         Collections.addAll(l1,res1);
         Collections.addAll(l1,res2);
         System.out.println(l1.get(0));

	}
}
