package com.ktds.sungman.make;

import java.io.File;

public class MakeDirectory {
	public void start() {
		String directoryPath = "C:\\Users\\xaiop\\Desktop\\go";
		// ���������
		File game = new File(directoryPath);
		if (!game.exists()) {
			game.mkdir();// make directory
		}
	}

	public static void main(String[] args) {
		new MakeDirectory().start();
	}
}
