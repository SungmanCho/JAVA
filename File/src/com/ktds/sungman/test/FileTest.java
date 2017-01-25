package com.ktds.sungman.test;

import java.io.File;

public class FileTest {
	
	public static void main(String[] args) {
		String folderPath ="C:\\Users\\xaiop\\Desktop\\Languages\\"; //���
		
		File languagesFolder = new File(folderPath);//��ο��� ������ �о�´�.������ java.io.File�� import
		
		//languagesFolder�� ��ΰ� ����(���丮)���� �������� �����Ѵ�.
		if(languagesFolder.isDirectory()){
			
			System.out.println(languagesFolder.getAbsolutePath()+"�� ����(���丮)�Դϴ�.");//���� ������ ���
		}
		else {
			System.out.println(languagesFolder.getPath()+"�� �����Դϴ�.");
		}
		File javaFolder = new File(languagesFolder.getAbsolutePath()+File.separator+"Java");//separator�� ��ο��� ���������̴�.
	
		if(javaFolder.isDirectory()){
			System.out.println(javaFolder.getAbsolutePath() +"�� ����(���丮)�Դϴ�.");
		}
		else{
			System.out.println(javaFolder.getAbsolutePath()+"�� �����Դϴ�.");
		}
		//javaFolder �ȿ� �ִ� ���빰�� �����´�.
		String[] contents=javaFolder.list();
		for(String content : contents){
			System.out.println(content);
		
		}
	}
}
