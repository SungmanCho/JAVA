package com.ktds.sungman.make;

import java.io.File;

public class MakeDirectories {
	public void start() {
		String directoryPath = "C:\\Users\\xaiop\\Desktop\\moblie\\pokemon\\go";
		// ���������
		File game = new File(directoryPath);

		if (!game.exists()) {
			game.mkdirs();// make directories, ������ ������ش�.
		}
	}

	public static void main(String[] args) {
		new MakeDirectories().start();
	}
}
