package com.cagemini.exp2;

public class pracexcp extends RuntimeException
{
	private String msg="not eligible";
	@Override
	public String getMessage() {

		return msg;
	}
}
