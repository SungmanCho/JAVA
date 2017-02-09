package com.ktds.sungman.test;

import java.io.File;

public class FileTest {
	
	public static void main(String[] args) {
		String folderPath ="C:\\Users\\xaiop\\Desktop\\Languages\\"; //경로
		
		File languagesFolder = new File(folderPath);//경로에서 파일을 읽어온다.파일은 java.io.File로 import
		
		//languagesFolder의 경로가 폴더(디렉토리)인지 파일인지 구분한다.
		if(languagesFolder.isDirectory()){
			
			System.out.println(languagesFolder.getAbsolutePath()+"는 폴더(디렉토리)입니다.");//현재 파일의 경로
		}
		else {
			System.out.println(languagesFolder.getPath()+"는 파일입니다.");
		}
		File javaFolder = new File(languagesFolder.getAbsolutePath()+File.separator+"Java");//separator는 경로에서 역슬래시이다.
	
		if(javaFolder.isDirectory()){
			System.out.println(javaFolder.getAbsolutePath() +"는 폴더(디렉토리)입니다.");
		}
		else{
			System.out.println(javaFolder.getAbsolutePath()+"는 파일입니다.");
		}
		//javaFolder 안에 있는 내용물을 가져온다.
		String[] contents=javaFolder.list();
		for(String content : contents){
			System.out.println(content);
		
		}
	}
}
