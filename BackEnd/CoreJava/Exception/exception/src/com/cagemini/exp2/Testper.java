package com.cagemini.exp2;

public class Testper {

	public static void main(String[] args)
	{
		valideper v=new valideper();
		try {
			v.validepercentage(72.5);
			System.out.println("valide percentage");
		}
		catch(pracexcp d) 
		{
			System.out.println(d.getMessage());
		}

	}
}
