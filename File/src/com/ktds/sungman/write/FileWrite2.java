package com.ktds.sungman.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite2 {
	public void start() {
		String filePath = "C:\\Users\\xaiop\\Desktop\\go\\makeFile.txt";

		try {
			//���Ͽ� �����͸� �ۼ��� �� �ֵ��� �������ִ� Ŭ����,�������� ����
			FileWriter fileWriter = new FileWriter(filePath, false);//false�ָ� �����ִ��� ����� ���� ����
			
			//�޸𸮿� �ִ� ������ �սǽ�Ű�� �ʰ� ���Ͼ� ������ �������ִ� Ŭ����
			//�޸��� �����͸� FileWrite���� �������ִ� ����
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			//�ۼ��Ϸ��� �����͸� �޸𸮿� ������ ���� ��ų �� �ֵ��� �������ִ� Ŭ����
			//�����͸� BufferedWriter���� �������ִ� ����
			PrintWriter printWriter = new PrintWriter(bufferedWriter);
			
			printWriter.println("���Ͽ� �ۼ��մϴ�... �;Ӿƾ�");
			
			printWriter.close();
			bufferedWriter.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileWrite2().start();
	}
}