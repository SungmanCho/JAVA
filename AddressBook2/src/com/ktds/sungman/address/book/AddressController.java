package com.ktds.sungman.address.book;


import java.util.Scanner;

import com.ktds.sungman.address.book.biz.AddressBiz;
import com.ktds.sungman.address.book.biz.AddressBizImpl;

public class AddressController {

	public void start() {

		AddressBiz addressBiz = new AddressBizImpl();

		Scanner input = new Scanner(System.in);
		int chooseMenu = 0;

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
				addressBiz.queryAllList();
			} else if (chooseMenu == 2) {
				addressBiz.findOneAddress();
			} else if (chooseMenu == 3) {
				addressBiz.removeAddress();
			} else if (chooseMenu == 4) {
				addressBiz.updateAddress();
			} else if (chooseMenu == 5) {
				addressBiz.addAddress();
			} else {
				break;
			}
		}
	}

	public static void main(String[] args) {
		new AddressController().start();
	}
}
