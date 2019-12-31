package com.test;

import java.util.ArrayList;
import java.util.List;

public class TestDebug {

	public static void main(String[] args) {
		List<String> a =  new ArrayList<>();
		a.add("1");
		a.add("2");
		//a.add(3);
		//a.add(4);
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}
