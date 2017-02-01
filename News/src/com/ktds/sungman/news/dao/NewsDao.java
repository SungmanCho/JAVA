package com.ktds.sungman.news.dao;

import java.util.List;

import com.ktds.sungman.news.vo.NewsVO;

public interface NewsDao {
	/*
	 * System.out.println("============뉴스 게시판 조회/글쓰기 조회===============");
	 * System.out.println("1.전체 뉴스 기사 제목 조회");
	 * System.out.println("2.뉴스 기사 제목 등록"); 
	 * System.out.println("3.종료");
	 * System.out.println("====================================");
	 * 
	 * System.out.println("메뉴를 선택하세요. :");
	 */

	// @return 모든 주소를 반환함
	// 주소록 조회
	public List<NewsVO> queryAllList();

	// 주소 검색
	// @param index 주소 번호(1,2,3,4...)
	// @return 하나의 주소를 반환함
	// 주소 추가
	// @param newAddress
	public void addNews(NewsVO newAddress);
}
