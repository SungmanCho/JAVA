package com.ktds.sungman.address.book.biz;


public interface AddressBiz {
	/*
	 * System.out.println("============�ּҷ� ���α׷�===============");
	 * System.out.println("1.�ּҷ� ��ȸ"); System.out.println("2.�ּҷ� �˻�");
	 * System.out.println("3.�ּҷ� ����"); System.out.println("4.�ּҷ� ����");
	 * System.out.println("5.�ּҷ� �߰�");
	 * System.out.println("====================================");
	 */

	// @return ��� �ּҸ� ��ȯ��
	// �ּҷ� ��ȸ

	
		

	public void queryAllList();

	// �ּ� �˻�
	// @param index �ּ� ��ȣ(1,2,3,4...)
	// @return �ϳ��� �ּҸ� ��ȯ��
	public void findOneAddress();

	// �ּ� ����
	// @param index ������ �ּ� ��ȣ(1,2,3,4...)
	//
	public void removeAddress();

	// �ּ� ����
	// @param index ������ �ּ� ��ȣ(1,2,3,4...)
	// @param newAddress �ű� �ּ� ����
	public void updateAddress();

	// �ּ� �߰�
	// @param newAddress
	public void addAddress();

}
