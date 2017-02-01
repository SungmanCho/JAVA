package com.ktds.sungman;

	public class Recursion {
		public void call(int index){
		System.out.println("Recursion.call() 호출 중......."+index);//메모리를 잡아먹어서 잘 안쓴다.
		
		if(index>=0){
		call(--index);
		
		}
	}
}
