package com.ktds.sungman;

public class Calcutor1 {
	public void printComputeResult(){
		int result =1+1;
		System.out.println(result);
	}
	/*printComputeResult method over loading
	�޼ҵ� �̸��� ������ �Ķ������ ������ ������ �ٸ� �޼ҵ�*/
	/*@param numberOne
	@param numberTwo*/
	//���� �ڵ忡�� ���� �� ���� �޾� ���ѵ� ����Ѵ�.
	public void printComputeResult(int numberOne, int numberTwo){
		int result = numberOne + numberTwo;
		System.out.println(result);
	}
	/*���� �ڵ忡�� ���� �ΰ��� �޾� ���ѵ� ����Ѵ�.
	 * @param numberOne: int ù���� ��
	@param numberTwo : int �ι�° ��
	@return:int numberOne*numberTwo*/
	public int getAndPrintMultiplicationResult(int numberOne, int numberTwo){
		int result = numberOne*numberTwo;
		System.out.println(result);
		
		return result;//void�� ��Ʈ�� �ٲ���Ѵ�. Ÿ�Ե� ���������. ��µ� ������ ��ȯ�� �Ѵ�. 
		//int Ÿ������ ȣ���ڿ��� �����ش�
	}
}