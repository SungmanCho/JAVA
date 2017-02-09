package com.ktds.sungman.explore;

import java.io.File;//import�� include�� ���,���� Ŭ������ ����Ʈ �Ѵٴ� ���̴�.

public class FileSystemExplore3 {

	public void printFileSystem(String path) {

		// 1. File ��ü ����(path������ ������ ������ ����)
		File directory = new File(path);

		// 1-1.directory ���� ������ Ž���Ѵ�.
		String[] contents = directory.list();
		File file = null;// ���۷��� ���� �ʱⰪ,�ʱ�ȭ�ϱ� ���ؼ�
		for (String content : contents) {
			// content�� directory�� ��θ� ������ ���ο� file ��ü�� �����Ѵ�.
			file = new File(directory.getAbsolutePath() + File.separator + content);// ����
																					// ������

			// 2. directory ��ü�� ������ �������� �������� �����Ѵ�.

			if (file.isDirectory()) {
				// 2-1. ������ ��� ���� ���θ� Ž���Ѵ�.
				printFileSystem(file.getAbsolutePath());
			}

			else {
				// 2-2. ������ ��� ������ ��θ� ����Ѵ�.
				System.out.println(file.getAbsolutePath());// ��� ���
			}
		}
	}
}
