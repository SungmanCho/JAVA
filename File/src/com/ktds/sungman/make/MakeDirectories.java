package com.ktds.sungman.make;

import java.io.File;

public class MakeDirectories {
	public void start() {
		String directoryPath = "C:\\Users\\xaiop\\Desktop\\moblie\\pokemon\\go";
		// 폴더만들기
		File game = new File(directoryPath);

		if (!game.exists()) {
			game.mkdirs();// make directories, 없으면 만들어준다.
		}
	}

	public static void main(String[] args) {
		new MakeDirectories().start();
	}
}
