package com.ktds.sungman;
//1�� 24�� ���� ����
public class PersonMain {
	public static void main(String[] args){
		
		Person khw = new Person();
		khw.setName("������");
		khw.setJob("���α׷���");
		khw.introduce();
		
		Person ibj = new Person();
		ibj.setName("�κ���");
		ibj.setJob("�౸����");
		ibj.introduce();
		
		Person pmw = new Person();
		pmw.setName("�ڹο�");
		pmw.setJob("���");
		pmw.introduce();
		
		Person unknown = new Person();
		unknown.introduce();
		
		Person ksk=new Person("�载��", "����");
		ksk.introduce();
	}
}
