package com.ktds.sungman.explore;

import java.io.File;

public class FileSystemExplore {

	public void printFileSystem(String path){
		
		//1. File ��ü ����(path������ ������ ������ ����)
		File directory = new File(path);
		
		//2. directory ��ü�� ������ �������� �������� ���д���.
		if(directory.isDirectory()){
			//2-1. ������ ��� ���� ���θ� Ž���Ѵ�.
			//printFileSystem(directory.getAbsolutePath() + File.separator + ?);
		}
		
		else{
		//2-2. ������ ��� ������ ��θ� ����Ѵ�.
			System.out.println(directory.getAbsolutePath());//��� ���
		}
	}
}
