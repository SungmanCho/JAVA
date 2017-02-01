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
			System.out.println("============주소록 프로그램===============");
			System.out.println("1.주소록 조회");
			System.out.println("2.주소록 검색");
			System.out.println("3.주소록 삭제");
			System.out.println("4.주소록 수정");
			System.out.println("5.주소록 추가");
			System.out.println("====================================");

			System.out.println("메뉴를 선택하세요. :");

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
