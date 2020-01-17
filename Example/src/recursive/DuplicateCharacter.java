package recursive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class DuplicateCharacter {
public static void main(String[] args) {
	String s="javatpoint";
	HashSet<String> h1=new HashSet();
	List<String> l1=new ArrayList<>();
	for(int i=0;i<s.length();i++)
	{
		
		
		h1.add(s.substring(i,i+1));
		l1.add(s.substring(i,i+1));
	}
	for(String res:h1)
	{
	System.out.println(res+"..."+Collections.frequency(l1,res));
	}
}
}
