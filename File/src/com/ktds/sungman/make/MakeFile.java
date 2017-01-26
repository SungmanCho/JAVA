package com.ktds.sungman.make;

import java.io.File;//파일 클래스 임포트
import java.io.IOException;

public class MakeFile {
	public void start() {
		String filePath = "C:\\Users\\xaiop\\Desktop\\makeFile.txt";//

		File textFile = new File(filePath);
		try {
			// 파일을 실제 저장소에 생성한다.
			if (!textFile.exists()) {
				textFile.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 파일을 실제로 만들어 주는 코드

	}

	public static void main(String[] args) {
		new MakeFile().start();
	}
}
