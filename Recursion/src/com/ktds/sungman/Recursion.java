package com.ktds.sungman;

	public class Recursion {
		public void call(int index){
		System.out.println("Recursion.call() ȣ�� ��......."+index);//�޸𸮸� ��ƸԾ �� �Ⱦ���.
		
		if(index>=0){
		call(--index);
		
		}
	}
}
