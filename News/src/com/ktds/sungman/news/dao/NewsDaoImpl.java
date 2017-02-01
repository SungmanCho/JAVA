package com.ktds.sungman.news.dao;

import java.util.List;

import java.util.ArrayList;

import com.ktds.sungman.news.vo.NewsVO;

public class NewsDaoImpl implements NewsDao {
	private List<NewsVO> newsList;

	public NewsDaoImpl() {
		newsList = new ArrayList<NewsVO>();
	}

	@Override
	public List<NewsVO> queryAllList() {
		return newsList;
	}

	@Override
	public void addNews(NewsVO newNews) {
		newsList.add(newNews);
	}

	
}
