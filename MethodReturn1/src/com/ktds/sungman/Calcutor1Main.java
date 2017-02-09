package com.ktds.sungman;

public class Calcutor1Main {
	

	public static void main(String[] args){
		Calcutor1 caltutor = new Calcutor1();
		caltutor.printComputeResult();
		caltutor.printComputeResult(10,30);
		int paramData=caltutor.getAndPrintMultiplicationResult(100, 50);
		int result = caltutor.getAndPrintMultiplicationResult(paramData,7);
		
		String message=String.format("%d * %d = %d", 10,7, result);//분역한것.
		System.out.println(message);
	}
}
