package com.ktds.sungman.news.dao;

import java.util.List;

import com.ktds.sungman.news.vo.NewsVO;

public interface NewsDao {
	/*
	 * System.out.println("============���� �Խ��� ��ȸ/�۾��� ��ȸ===============");
	 * System.out.println("1.��ü ���� ��� ���� ��ȸ");
	 * System.out.println("2.���� ��� ���� ���"); 
	 * System.out.println("3.����");
	 * System.out.println("====================================");
	 * 
	 * System.out.println("�޴��� �����ϼ���. :");
	 */

	// @return ��� �ּҸ� ��ȯ��
	// �ּҷ� ��ȸ
	public List<NewsVO> queryAllList();

	// �ּ� �˻�
	// @param index �ּ� ��ȣ(1,2,3,4...)
	// @return �ϳ��� �ּҸ� ��ȯ��
	// �ּ� �߰�
	// @param newAddress
	public void addNews(NewsVO newAddress);
}
