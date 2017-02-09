package com.ktds.sungman.address.book;

import java.util.List;
import java.util.Scanner;

import com.ktds.sungman.address.book.biz.AddressBiz;
import com.ktds.sungman.address.book.biz.AddressBizImpl;
import com.ktds.sungman.address.book.vo.AddressVO;

public class Main {

	public void start() {
		AddressBiz addressBiz = new AddressBizImpl();

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int chooseMenu = 0;
		
		List<AddressVO> addressList = null;
		int addressNumber = 0;
		AddressVO addressVO = null;
		
		String nameTemp = "";
		String phoneNumberTemp = "";
		String addressTemp = "";
		
		while (true) {
			System.out.println("============�ּҷ� ���α׷�===============");
			System.out.println("1.�ּҷ� ��ȸ");
			System.out.println("2.�ּҷ� �˻�");
			System.out.println("3.�ּҷ� ����");
			System.out.println("4.�ּҷ� ����");
			System.out.println("5.�ּҷ� �߰�");
			System.out.println("====================================");

			System.out.println("�޴��� �����ϼ���. :");

			chooseMenu = input.nextInt();

			if (chooseMenu == 1) {
				addressList = addressBiz.queryAllList();
				for (AddressVO address : addressList) {
					System.out.printf("�̸� : %s, ��ȭ��ȣ : %s, �ּ� : %s\n", address.getName(), address.getPhoneNumber(),
							address.getAddress());
				}
			} else if (chooseMenu == 2) {
				System.out.println("�ּҷ� ��ȣ:");
				addressNumber = input.nextInt();
				addressVO = addressBiz.findOneAddress(addressNumber);
				System.out.printf("�̸� : %s, ��ȭ��ȣ : %s, �ּ� : %s\n", addressVO.getName(), addressVO.getPhoneNumber(),
						addressVO.getAddress());
			} else if (chooseMenu == 3) {
				System.out.println("�ּҷ� ��ȣ:");
				addressNumber = input.nextInt();
				addressBiz.remonveAddress(addressNumber);

			} else if (chooseMenu == 4) {
				System.out.println("�ּҷ� ��ȣ:");
				addressNumber = input.nextInt();
				addressVO = addressBiz.findOneAddress(addressNumber);
				System.out.printf("�̸� : %s, ��ȭ��ȣ : %s, �ּ� : %s\n", addressVO.getName(), addressVO.getPhoneNumber(),
						addressVO.getAddress());
				System.out.println("���ο� �ּ� ������ �Է��ϼ���.");
				System.out.println("�̸��� �Է��ϼ���.");
				nameTemp = input.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
				phoneNumberTemp = input.next();
				System.out.println("�ּҸ� �Է��ϼ���");
				addressTemp = input.next();

				addressVO = new AddressVO();
				addressVO.setName(nameTemp);
				addressVO.setPhoneNumber(phoneNumberTemp);
				addressVO.setAddress(addressTemp);

				addressBiz.updateAddress(addressNumber, addressVO);

			} else if (chooseMenu == 5) {
				System.out.println("���ο� �ּ� ������ �Է��ϼ���.");
				System.out.println("�̸��� �Է��ϼ���. :");
				nameTemp = input.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���. :");
				phoneNumberTemp = input.next();
				System.out.println("�ּҸ� �Է��ϼ��� : ");
				addressTemp = input.next();

				addressVO = new AddressVO();
				addressVO.setName(nameTemp);
				addressVO.setPhoneNumber(phoneNumberTemp);
				addressVO.setAddress(addressTemp);

				addressBiz.updateAddress(addressNumber, addressVO);
			} else {
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Main().start();
	}
}
