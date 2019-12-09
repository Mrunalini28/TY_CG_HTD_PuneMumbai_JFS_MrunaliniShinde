package com.cagemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Test10 {

	public static void main(String[] args) 
	{
		 ArrayList<Double> al=new ArrayList<Double>();
	     al.add(2.4);
	     al.add(9.6);
	     al.add(5.1);
	     al.add(4.1);
	     Iterator<Double> it=al.iterator();
	     while(it.hasNext()) {
	    	 Double r= it.next();
	    	 System.out.println(r);
	     }    
	}

}
