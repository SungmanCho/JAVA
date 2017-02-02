package com.ktds.sungman;

import com.ktds.sungman.helper.FileWriteHelper;

public class Calculator {
		public void start() {
			int result = 70+10;
			String message = String.format("%d+%d=%d", 70,10,result);
			System.out.println(message);
			
			FileWriteHelper fileWriteHelper = new FileWriteHelper();
			
			fileWriteHelper.log(message);
			
		}
		
		public static void main(String[] args) {
			new Calculator().start();
			
		}
}
