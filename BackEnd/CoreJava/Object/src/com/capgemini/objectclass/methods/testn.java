package com.capgemini.objectclass.methods;

public class testn {
	public static void main(String[] args) {
		
		cow c=new cow();
		c.id=1;
		c.name="ganga";
		
		cow d=new cow();
		d.id=2;
		d.name="tanga";
		
		cow e=new cow();
		e.id=1;
		e.name="ganga";
		 
		boolean res=c.equals(e);
		System.out.println(res);
		
	}

}
