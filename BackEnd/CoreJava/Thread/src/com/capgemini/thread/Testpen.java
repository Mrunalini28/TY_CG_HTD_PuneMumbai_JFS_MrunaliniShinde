package com.capgemini.thread;

public class Testpen {

	public static void main(String[] args) 
	{
	System.out.println("main started...");
     Pen p=new Pen();
     p.start();
     try {
		p.join();
	} 
     catch (InterruptedException e) 
     {
		e.printStackTrace();
	}
     
     Pen t=new Pen();
     t.start();
     try {
		t.join();
	}
     catch (InterruptedException e)
     {
		e.printStackTrace();
	}
     System.out.println("main ended....");
	}
}
