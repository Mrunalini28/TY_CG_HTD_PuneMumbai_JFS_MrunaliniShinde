package com.capgemini.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Testbank {

	public static void main(String[] args)
	{
		ById comp =new ById(); 
		Byname name =new Byname();
		Bymicr micr =new Bymicr();
		TreeSet<Bank> t=new TreeSet<Bank>(micr);

		Bank b1=new Bank(1,"ICICI",845992254);
		Bank b2=new Bank(2,"HDFC",412582524);
		Bank b3=new Bank(3,"SBI",244542441);
		t.add(b1);
		t.add(b2);
		t.add(b3);

		Iterator<Bank> it =t.iterator();
		while(it.hasNext()) 
		{
			Bank f=it.next();
			System.out.println("id is :"+f.pin);
			System.out.println("name is :"+f.name);
			System.out.println("micr is :"+f.micr);
			System.out.println("----------------");
		}
	}
}
