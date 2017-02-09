package com.ktds.sungman.explore;

import java.io.File;//import는 include와 비슷,파일 클래스만 임포트 한다는 뜻이다.

public class FileSystemExplore3 {

	public void printFileSystem(String path) {

		// 1. File 객체 생성(path정보를 가지는 파일을 만듦)
		File directory = new File(path);

		// 1-1.directory 안의 내용을 탐색한다.
		String[] contents = directory.list();
		File file = null;// 래퍼런스 값의 초기값,초기화하기 위해서
		for (String content : contents) {
			// content와 directory의 경로를 결합해 새로운 file 객체를 생성한다.
			file = new File(directory.getAbsolutePath() + File.separator + content);// 파일
																					// 구분자

			// 2. directory 객체의 내용이 폴더인지 파일인지 구분한다.

			if (file.isDirectory()) {
				// 2-1. 폴더일 경우 폴더 내부를 탐색한다.
				printFileSystem(file.getAbsolutePath());
			}

			else {
				// 2-2. 파일일 경우 파일의 경로를 출력한다.
				System.out.println(file.getAbsolutePath());// 경로 출력
			}
		}
	}
}
