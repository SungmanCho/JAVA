package com.ktds.sungman.make;

import java.io.File;//���� Ŭ���� ����Ʈ
import java.io.IOException;

public class MakeFile {
	public void start() {
		String filePath = "C:\\Users\\xaiop\\Desktop\\makeFile.txt";//

		File textFile = new File(filePath);
		try {
			// ������ ���� ����ҿ� �����Ѵ�.
			if (!textFile.exists()) {
				textFile.createNewFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // ������ ������ ����� �ִ� �ڵ�

	}

	public static void main(String[] args) {
		new MakeFile().start();
	}
}
