package com.cagemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Test15stack {

	public static void main(String[] args) {
		Stack v = new Stack();
		v.add(20);
		v.add("mrunal");
		v.add(true);
		System.out.println("------forloop---------");
		for (int i = 0; i < 3; i++) {
			Object r = v.get(i);
			System.out.println(r);
		}
		System.out.println("--------for each---------");
		for (Object a : v) {
			System.out.println(a);
		}
		System.out.println("-------iterator-----");
		Iterator it = v.iterator();
		while (it.hasNext()) {
			Object a = it.next();
			System.out.println(a);
		}
		System.out.println("-----listiterator-----------");
		ListIterator lit = v.listIterator();
		System.out.println("farward----->");
		while (lit.hasNext()) {
			Object a = lit.next();
			System.out.println(a);
		}
		System.out.println("<--------backword");
		while (lit.hasPrevious()) {
			Object a = lit.previous();
			System.out.println(a);
		}
	}

}
