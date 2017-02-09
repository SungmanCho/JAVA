package com.ktds.sungman.exceptions;

public class MissMatchValueException extends RuntimeException {
	public MissMatchValueException() {
		super();
	}

	public MissMatchValueException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public MissMatchValueException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public MissMatchValueException(String arg0) {
		super(arg0);
	}

	public MissMatchValueException(Throwable arg0) {
		super(arg0);
	}

	public static void main(String[] args) {

	}
}
