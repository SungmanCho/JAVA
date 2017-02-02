package com.ktds.sungman;

import java.util.*;


public class HashMapExam {
	public static void main(String[] args) {
		Map<String, String>map = new HashMap<String, String>();
		
		map.put("banana","바나나" );
		map.put("orange", "오렌지");
		
		String korean = map.get("orange");
		System.out.println(korean);
		
		map.remove("banana");
	}
}
