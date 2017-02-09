package com.ktds.sungman.exceptions;

public class MissingValueException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6476402268164159765L;

	public MissingValueException() {
		super();
	}

	public MissingValueException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);//Thowable 가장 상위 예외이다. 어떠한 타입이든지 다 보낼 수가 있다.
	}

	public MissingValueException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public MissingValueException(String arg0) {
		super(arg0);
	}

	public MissingValueException(Throwable arg0) {
		super(arg0);
	}
	
	
	
}
