package com.ktds.sungman;

public class Student {
		private String s = "����";//�ܺο��� ���к��� ������ ���� ���ؼ� ����.
		private String st = "�л�";
		private String f = "�޽�";
		private String b = "������";
		private String n = "������";
		private String t = "����";
	
		//instance field�� ���ؼ� setter�� ����
		//setter�� ������ �����͸� ���� �����ִ� ���̴�. �����͸� �Ժη� �ٲܼ� ���� �ϴ� ��.
		/*public void setName() {
			// name  �ν��Ͻ� �ʵ带 ������.
		}*/
		/*public void set���������(�������Ÿ�� ���������){
			this.set��������� = ���������;
		}*/
		public void setStudy(String study){
			if(study.length()==5){
			this.s = study;
			}
		}
		public void setName(String name){
			if(name.length()==2){
			this.n = name;
			}
		}
		public void setEat(String eat){
			if(eat.length()==4){
			this.f = eat;
			}
		}
		public void setTest(String test){
			if(test.length()==3){
			this.t = test;
			}
		}
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
