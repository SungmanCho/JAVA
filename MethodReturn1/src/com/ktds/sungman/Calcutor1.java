package com.ktds.sungman;

public class Calcutor1 {
	public void printComputeResult(){
		int result =1+1;
		System.out.println(result);
	}
	/*printComputeResult method over loading
	메소드 이름은 같지만 파라미터의 종류나 개수가 다른 메소드*/
	/*@param numberOne
	@param numberTwo*/
	//메인 코드에서 숫자 두 개를 받아 더한뒤 출력한다.
	public void printComputeResult(int numberOne, int numberTwo){
		int result = numberOne + numberTwo;
		System.out.println(result);
	}
	/*메인 코드에서 숫자 두개를 받아 곱한뒤 출력한다.
	 * @param numberOne: int 첫번쨰 수
	@param numberTwo : int 두번째 수
	@return:int numberOne*numberTwo*/
	public int getAndPrintMultiplicationResult(int numberOne, int numberTwo){
		int result = numberOne*numberTwo;
		System.out.println(result);
		
		return result;//void를 인트로 바꿔야한다. 타입도 맞춰줘야함. 출력도 하지만 반환도 한다. 
		//int 타입으로 호출자에게 돌려준다
	}
}