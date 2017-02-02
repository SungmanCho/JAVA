package com.ktds.sungman.helper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteHelper {
	private static final String LOG_FOLDER_PATH = "C:\\Users\\xaiop\\Desktop\\logs";
	private static final String LOG_FILE_PATH = LOG_FOLDER_PATH + "\\Calculator.log";

	public static void log(String message) {

		// "C:\\Users\\xaiop\\Desktop\\logs 폴더를 생성한다.
		makeLogsFolder();
		// "C:\\Users\\xaiop\\Desktop\\logs\\Calculator.log 파일을 생성한다.
		makeCalculatorLogFile();
		// "C:\\Users\\xaiop\\Desktop\\logs\\Calculator.log 파일에 message를 기록한다.
		writeLog(message);
	}

	private static void makeLogsFolder() {
		File logsFolder = new File(LOG_FOLDER_PATH);

		if (!logsFolder.exists()) {
			logsFolder.mkdirs();
		}
	}

	private static void makeCalculatorLogFile() {

		File logFile = new File(LOG_FILE_PATH);

		if (!logFile.exists() || !logFile.isFile()) {
			try {
				logFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void writeLog(String message) {
		try {
			FileWriter fw = new FileWriter(LOG_FILE_PATH, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw);

			out.println(message);

			out.close();
			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
