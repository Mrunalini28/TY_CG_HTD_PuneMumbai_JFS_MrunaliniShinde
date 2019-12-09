package com.capgemini.string;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Test1 {

	public static void main(String[] args)
	{
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		p.add(24);
		p.add(51);
		p.add(34);
		p.add(20);
		p.add(11);
		Iterator<Integer> it=p.iterator();
		{
			while(it.hasNext()) {
				Integer i=it.next();
				System.out.println(i);
			}

		}
	}
}
