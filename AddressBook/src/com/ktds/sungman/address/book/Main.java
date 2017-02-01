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
				addressList = addressBiz.queryAllList();
				for (AddressVO address : addressList) {
					System.out.printf("이름 : %s, 전화번호 : %s, 주소 : %s\n", address.getName(), address.getPhoneNumber(),
							address.getAddress());
				}
			} else if (chooseMenu == 2) {
				System.out.println("주소록 번호:");
				addressNumber = input.nextInt();
				addressVO = addressBiz.findOneAddress(addressNumber);
				System.out.printf("이름 : %s, 전화번호 : %s, 주소 : %s\n", addressVO.getName(), addressVO.getPhoneNumber(),
						addressVO.getAddress());
			} else if (chooseMenu == 3) {
				System.out.println("주소록 번호:");
				addressNumber = input.nextInt();
				addressBiz.remonveAddress(addressNumber);

			} else if (chooseMenu == 4) {
				System.out.println("주소록 번호:");
				addressNumber = input.nextInt();
				addressVO = addressBiz.findOneAddress(addressNumber);
				System.out.printf("이름 : %s, 전화번호 : %s, 주소 : %s\n", addressVO.getName(), addressVO.getPhoneNumber(),
						addressVO.getAddress());
				System.out.println("새로운 주소 정보를 입력하세요.");
				System.out.println("이름을 입력하세요.");
				nameTemp = input.next();
				System.out.println("전화번호를 입력하세요.");
				phoneNumberTemp = input.next();
				System.out.println("주소를 입력하세요");
				addressTemp = input.next();

				addressVO = new AddressVO();
				addressVO.setName(nameTemp);
				addressVO.setPhoneNumber(phoneNumberTemp);
				addressVO.setAddress(addressTemp);

				addressBiz.updateAddress(addressNumber, addressVO);

			} else if (chooseMenu == 5) {
				System.out.println("새로운 주소 정보를 입력하세요.");
				System.out.println("이름을 입력하세요. :");
				nameTemp = input.next();
				System.out.println("전화번호를 입력하세요. :");
				phoneNumberTemp = input.next();
				System.out.println("주소를 입력하세요 : ");
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
