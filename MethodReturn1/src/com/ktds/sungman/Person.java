package com.ktds.sungman;
//1�� 24�� ���� ����
public class Person {
	private String name;
	private String job;
	/*
	Default ������
	*/
	public Person(){
		System.out.println("Person �⺻ ������ �����.");
	}
	/*������ �����ε�
	�⺻ �����ڿ� �Ķ���͸� �߰��� �����͸� �ʱ�ȭ ��Ų��.*/
	/*@param name
	@param job*/
	public Person(String name, String job){
		System.out.println("Person ������ �����!");
		setName(name);//�³��� ȣ��
		setJob(job);//���� ȣ��
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setJob(String job){
		this.job=job;
	}
	/*public ������_�������Ÿ��_set������_�������_��()
		return ������_�������_��*/
	public String getName(){
		return this.name;
	}
	public String getJob(){
		return this.job;
	}
	public void introduce(){
		
		String message = String.format("�̸� : %s, ����: %s", name,job);//�տ��� �����߱⶧���� ������� �ʴ´�.
		System.out.println(message);
	}
}
