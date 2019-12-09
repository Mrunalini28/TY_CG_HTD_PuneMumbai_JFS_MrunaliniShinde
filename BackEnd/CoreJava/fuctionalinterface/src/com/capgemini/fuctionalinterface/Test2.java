package com.capgemini.fuctionalinterface;

import java.util.function.Function;

public class Test2 {

	public static void main(String[] args) 
	{
		Function <Integer,Integer> f= i-> i*i;
		int ans=f.apply(25);
		System.out.println("result is:"+ans);
	}
}
