package com.ktds.sungman.news.biz;

public interface NewsBiz {
	/*
	 * System.out.println("============�ּҷ� ���α׷�===============");
	 * System.out.println("1.�ּҷ� ��ȸ"); System.out.println("2.�ּҷ� �˻�");
	 * System.out.println("3.�ּҷ� ����"); System.out.println("4.�ּҷ� ����");
	 * System.out.println("5.�ּҷ� �߰�");
	 * System.out.println("====================================");
	 */

	// @return ��� �ּҸ� ��ȯ��
	// �ּҷ� ��ȸ

	public void queryAllList();

	// �ּ� �߰�
	// @param newAddress
	public void addNews();

}
