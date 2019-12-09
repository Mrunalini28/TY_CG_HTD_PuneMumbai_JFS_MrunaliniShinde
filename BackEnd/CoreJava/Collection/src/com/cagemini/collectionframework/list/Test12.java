package com.cagemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;

public class Test12 {

	public static void main(String[] args) {
		LinkedList lit =new LinkedList();
		lit.add("mrunal");
		lit.add(5);
		lit.add(true);
		Iterator it=lit.iterator();
		while(it.hasNext()) 
		{
			Object r= it.next();
			System.out.println(r);
		}  
		for(Object r: lit) {
			System.out.println(r);
		}
		for(int i=0;i<4;i++) {
			Object r=lit.get(i);
			System.out.println(r);
		} 

	}

}
