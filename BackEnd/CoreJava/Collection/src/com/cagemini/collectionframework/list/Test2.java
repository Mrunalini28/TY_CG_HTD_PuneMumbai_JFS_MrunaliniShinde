package com.cagemini.collectionframework.list;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(24);
		al.add("chinuu");
		al.add(2.9);
		al.add('M');

		for(Object r:al) 
		{
			System.out.println(r);
		}
	}
}
