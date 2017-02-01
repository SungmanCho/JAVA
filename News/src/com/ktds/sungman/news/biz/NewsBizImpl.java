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
			System.out.printf("���� ���� : %s, ��л� : %s, ���� �̸� : %s\n", 
					news.getNewsName(), news.getPress(), news.getReporterName());
		}
	}

	
	@Override
	public void addNews() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���ο� ���� ������ �Է��ϼ���.");
		System.out.println("���� ������ �Է��ϼ���. :");
		String titleTemp = input.next();
		System.out.println("��л� �̸��� �Է��ϼ���. :");
		String pressTemp = input.next();
		System.out.println("���� �̸��� �Է��ϼ���. :");
		String nameTemp = input.next();
		
		NewsVO newsVO = new NewsVO();
		newsVO.setNewsName(titleTemp);
		newsVO.setPress(pressTemp);
		newsVO.setReporterName(nameTemp);
		
		newsDao.addNews(newsVO);
	}

	

}
