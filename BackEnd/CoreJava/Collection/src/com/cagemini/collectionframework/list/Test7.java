package com.cagemini.collectionframework.list;

import java.util.ArrayList;

public class Test7 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("raju");
		al.add(19);
		al.add('m');
		al.add(6.14);
		for(Object a:al) 
		 {
			System.out.println(a);
		}

	}
}
