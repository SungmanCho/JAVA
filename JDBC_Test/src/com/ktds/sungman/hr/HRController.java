package com.ktds.sungman.hr;

import com.ktds.sungman.hr.biz.*;



public class HRController {
	private HRBiz hrBiz;
	
	public HRController(){
		hrBiz= new HRBizImpl();
	}
	public void start(){
		
		hrBiz.printOneEmployees(200);
		
	}
	public static void main(String[] args) {
		new HRController().start();
	}
}
