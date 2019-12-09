package com.cagemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Test16 {

	public static void main(String[] args) {
		Stack <String> v=new Stack<String>();
		v.add("abc");
		v.add("mrunal");
		v.add("def");
		System.out.println("------forloop---------");
		for(int i=0;i<3;i++) 
		{
			String r=v.get(i);
			System.out.println(r);
		}
		System.out.println("--------for each---------");
		for(String a:v) {
			System.out.println(a);
		}
		System.out.println("-------iterator-----");
		Iterator<String> it=v.iterator();
		while(it.hasNext()) {
			String a=it.next();
			System.out.println(a);
		}
		System.out.println("-----listiterator-----------");
		ListIterator <String>lit =v.listIterator();
		System.out.println("farward----->");
		while(lit.hasNext()) {
			String a=lit.next();
			System.out.println(a);
		}
		System.out.println("<--------backword");
		while(lit.hasPrevious()) {
			String a=lit.previous();
			System.out.println(a);
		}
	}

}

