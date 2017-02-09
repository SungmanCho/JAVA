package com.ktds.sungman.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
	public void start() {
		String filePath = "C:\\Users\\xaiop\\Desktop\\go\\makeFile.txt";

		try {
			/*//파일에 데이터를 작성할 수 있도록 지원해주는 클래스,역순으로 실행
			FileWriter fileWriter = new FileWriter(filePath, false);//false주면 원래있던걸 지우고 새로 실행
			
			//메모리에 있는 내용을 손실시키지 않고 파일애 쓰도록 지원해주는 클래스
			//메모리의 데이터를 FileWrite에게 전달해주는 역할
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			//작성하려는 데이터를 메모리에 적절히 적재 시킬 수 있도록 지원해주는 클래스
			//데이터를 BufferedWriter에게 전달해주는 역할
			PrintWriter printWriter = new PrintWriter(bufferedWriter);
			*/
			//한 줄로 쓰는 법
			PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(filePath,true)));
			printWriter.println("파일에 작성합니다... 와앙아앙");
			
		
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileWrite().start();
	}
}
