package com.ktds.sungman;

public class Army {
	
	public final String JOB = "��������";
	
	public Person makeArmy(String name){
		//�ܺο��� ���޹��� �̸��� �̿��� Person ��ü�� �����Ѵ�.
		Person army=new Person(name,JOB);
		
		//������ Person ��ü�� ��ȯ�Ѵ�.
		return army;//�ƹ��� Ÿ���� person������ �ٲ۴�.
	}
	
}
