package com.ktds.sungman;

public class Student {
		private String s = "공부";
		private String st = "학생";
		private String f = "급식";
		private String b = "교과서";
		private String n = "조성만";
		private String t = "시험";
		
		public void study(){
			String message= String.format("%s를 하기 위해 %s를 폅니다.",s,b);
			System.out.println(message);
		}
		public void name(){
			String message= String.format("%s의 이름은 %s입니다",st,n);
			System.out.println(message);
		}
		public void eat(){
			String message= String.format("%s은 %s을 먹습니다.",st,f);
			System.out.println(message);
		}
		public void test(){
			String message= String.format("%s은 %s로 공부를 해서 %s을 봅니다.",st,b,t);
			System.out.println(message);
		}
	}
