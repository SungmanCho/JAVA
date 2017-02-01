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
			System.out.println("============뉴스 게시판 조회/글쓰기 조회===============");
			System.out.println("1.전체 뉴스 기사 제목 조회");
			System.out.println("2.뉴스 기사 제목 등록");
			System.out.println("3.종료");
			System.out.println("============================================");

			System.out.println("메뉴를 선택하세요. :");

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
