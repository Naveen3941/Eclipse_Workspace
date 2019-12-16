package example;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

public class Anagram {

	public static void main(String[] args) {
	   
		String a="Abcd";
		String b="dbca";
		String textInBold = "Java_Prof_Level";
		System.out.println( textInBold);
		int res=0,res1=0;
		
		for(int i=0;i<a.length();i++)
		{
			res=res+a.toLowerCase().charAt(i);
		}
		for(int i=0;i<b.length();i++)
		{
			res1=res1+b.toLowerCase().charAt(i);
		}

		System.out.println(res+"..."+res1);
		if(res==res1)
		{
			System.out.println("String is Anagram");
		}
		else
		{
			System.out.println("String is not Anagram");
		}

	}

}
