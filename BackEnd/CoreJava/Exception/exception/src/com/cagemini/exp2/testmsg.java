package com.cagemini.exp2;

public class testmsg {

	public static void main(String[] args) {
		Amount a=new Amount();
		try {
			a.check(6000);
			System.out.println("collect cash");
		}
		catch(Invalidlimitexception d) 
		{
			d.printStackTrace();
		}
	}
}
