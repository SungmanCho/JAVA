package com.ktds.sungman.news.biz;

public interface NewsBiz {
	/*
	 * System.out.println("============주소록 프로그램===============");
	 * System.out.println("1.주소록 조회"); System.out.println("2.주소록 검색");
	 * System.out.println("3.주소록 삭제"); System.out.println("4.주소록 수정");
	 * System.out.println("5.주소록 추가");
	 * System.out.println("====================================");
	 */

	// @return 모든 주소를 반환함
	// 주소록 조회

	public void queryAllList();

	// 주소 추가
	// @param newAddress
	public void addNews();

}
