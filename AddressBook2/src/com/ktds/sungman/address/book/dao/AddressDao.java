package com.ktds.sungman.address.book.dao;

import java.util.List;

import com.ktds.sungman.address.book.vo.AddressVO;

public interface AddressDao {
	/*System.out.println("============�ּҷ� ���α׷�===============");
	System.out.println("1.�ּҷ� ��ȸ");
	System.out.println("2.�ּҷ� �˻�");
	System.out.println("3.�ּҷ� ����");
	System.out.println("4.�ּҷ� ����");
	System.out.println("5.�ּҷ� �߰�");
	System.out.println("====================================");*/
	
//	@return ��� �ּҸ� ��ȯ��
	//�ּҷ� ��ȸ
	public List<AddressVO> queryAllList();
	//�ּ� �˻�
	//@param index �ּ� ��ȣ(1,2,3,4...)
	//@return �ϳ��� �ּҸ� ��ȯ��
	public  AddressVO findOneAddress(int index);
	//�ּ� ����
	//@param index ������ �ּ� ��ȣ(1,2,3,4...)
	//
	public void removeAddress(int index);
	//�ּ� ����
	//@param index ������ �ּ� ��ȣ(1,2,3,4...)
	//@param newAddress �ű� �ּ� ����
	public void updateAddress(int index, AddressVO newAddress);
	//�ּ� �߰�
	//@param newAddress
	public void addAddress(AddressVO newAddress);
}
	
