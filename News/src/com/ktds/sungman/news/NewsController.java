package com.ktds.sungman.news;


import java.util.Scanner;


import com.ktds.sungman.news.biz.NewsBiz;
import com.ktds.sungman.news.biz.NewsBizImpl;

public class NewsController {

	public void start() {

		NewsBiz newsBiz = new NewsBizImpl();

		Scanner input = new Scanner(System.in);
		int chooseMenu = 0;

		while (true) {
			System.out.println("============���� �Խ��� ��ȸ/�۾��� ��ȸ===============");
			System.out.println("1.��ü ���� ��� ���� ��ȸ");
			System.out.println("2.���� ��� ���� ���");
			System.out.println("3.����");
			System.out.println("============================================");

			System.out.println("�޴��� �����ϼ���. :");

			chooseMenu = input.nextInt();

			if (chooseMenu == 1) {
				newsBiz.queryAllList();
			} else if (chooseMenu == 2) {
				newsBiz.addNews();
			} else if (chooseMenu == 3) {
				break;
			} 
		}
	}

	public static void main(String[] args) {
		new NewsController().start();
	}
}
