package com.ktds.sungman.news.biz;

import java.util.List;
import java.util.Scanner;

import com.ktds.sungman.news.dao.NewsDao;
import com.ktds.sungman.news.dao.NewsDaoImpl;
import com.ktds.sungman.news.vo.NewsVO;

public class  NewsBizImpl implements NewsBiz {

	private NewsDao newsDao;
	
	public NewsBizImpl() {
		newsDao = new NewsDaoImpl();
	}
	
	@Override
	public void queryAllList() {
		List<NewsVO> newsList = newsDao.queryAllList();
		for ( NewsVO news : newsList ) {
			System.out.printf("뉴스 제목 : %s, 언론사 : %s, 기자 이름 : %s\n", 
					news.getNewsName(), news.getPress(), news.getReporterName());
		}
	}

	
	@Override
	public void addNews() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("새로운 뉴스 정보를 입력하세요.");
		System.out.println("뉴스 제목을 입력하세요. :");
		String titleTemp = input.next();
		System.out.println("언론사 이름을 입력하세요. :");
		String pressTemp = input.next();
		System.out.println("기자 이름을 입력하세요. :");
		String nameTemp = input.next();
		
		NewsVO newsVO = new NewsVO();
		newsVO.setNewsName(titleTemp);
		newsVO.setPress(pressTemp);
		newsVO.setReporterName(nameTemp);
		
		newsDao.addNews(newsVO);
	}

	

}
