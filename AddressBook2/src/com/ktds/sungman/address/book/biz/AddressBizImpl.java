package com.ktds.sungman.address.book.biz;

import java.util.List;
import java.util.Scanner;

import com.ktds.sungman.address.book.dao.AddressDao;
import com.ktds.sungman.address.book.dao.AddressDaoImpl;
import com.ktds.sungman.address.book.vo.AddressVO;

public class  AddressBizImpl implements AddressBiz {

	private AddressDao addressDao;
	
	public AddressBizImpl() {
		addressDao = new AddressDaoImpl();
	}
	
	@Override
	public void queryAllList() {
		List<AddressVO> addressList = addressDao.queryAllList();
		for ( AddressVO address : addressList ) {
			System.out.printf("�̸� : %s, ��ȭ��ȣ : %s, �ּ� : %s\n", 
					address.getName(), address.getPhoneNumber(), address.getAddress());
		}
	}

	@Override
	public void findOneAddress() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�ּҷ��� ��ȣ�� �Է��ϼ���.");
		int addressNumber = input.nextInt();
		AddressVO addressVO = addressDao.findOneAddress(addressNumber);
		System.out.printf("�̸� : %s, ��ȭ��ȣ : %s, n�ּ� : %s\n", 
				addressVO.getName(), addressVO.getPhoneNumber(), addressVO.getAddress());
	}

	@Override
	public void removeAddress() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("�ּҷ��� ��ȣ�� �Է��ϼ���.");
		int addressNumber = input.nextInt();
		addressDao.removeAddress(addressNumber);
	}

	@Override
	public void updateAddress() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�ּҷ��� ��ȣ�� �Է��ϼ���.");
		int addressNumber = input.nextInt();
		AddressVO addressVO = addressDao.findOneAddress(addressNumber);
		System.out.printf("�̸� : %s, ��ȭ��ȣ : %s, �ּ� : %s\n", 
				addressVO.getName(), addressVO.getPhoneNumber(), addressVO.getAddress());
		
		System.out.println("���ο� �ּ� ������ �Է��ϼ���.");
		System.out.println("�̸��� �Է��ϼ���.");
		String nameTemp = input.next();
		System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
		String phoneNumberTemp = input.next();
		System.out.println("�ּҸ� �Է��ϼ���.");
		String addressTemp = input.next();
		
		addressVO = new AddressVO();
		addressVO.setName(nameTemp);
		addressVO.setPhoneNumber(phoneNumberTemp);
		addressVO.setAddress(addressTemp);
		
		addressDao.updateAddress(addressNumber, addressVO);
	}

	@Override
	public void addAddress() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���ο� �ּ� ������ �Է��ϼ���.");
		System.out.println("�̸��� �Է��ϼ���.");
		String nameTemp = input.next();
		System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
		String phoneNumberTemp = input.next();
		System.out.println("�ּҸ� �Է��ϼ���.");
		String addressTemp = input.next();
		
		AddressVO addressVO = new AddressVO();
		addressVO.setName(nameTemp);
		addressVO.setPhoneNumber(phoneNumberTemp);
		addressVO.setAddress(addressTemp);
		
		addressDao.addAddress(addressVO);
	}

	

}
