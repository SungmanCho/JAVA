package com.ktds.sungman;

public class Student {
		private String s = "����";
		private String st = "�л�";
		private String f = "�޽�";
		private String b = "������";
		private String n = "������";
		private String t = "����";
		
		public void study(){
			String message= String.format("%s�� �ϱ� ���� %s�� ��ϴ�.",s,b);
			System.out.println(message);
		}
		public void name(){
			String message= String.format("%s�� �̸��� %s�Դϴ�",st,n);
			System.out.println(message);
		}
		public void eat(){
			String message= String.format("%s�� %s�� �Խ��ϴ�.",st,f);
			System.out.println(message);
		}
		public void test(){
			String message= String.format("%s�� %s�� ���θ� �ؼ� %s�� ���ϴ�.",st,b,t);
			System.out.println(message);
		}
	}
