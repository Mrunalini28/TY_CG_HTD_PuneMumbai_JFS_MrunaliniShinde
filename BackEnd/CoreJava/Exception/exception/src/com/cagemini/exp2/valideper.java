package com.cagemini.exp2;

public class valideper
{
	void validepercentage(double per) 
	{
		if(per<66.6) {
			throw new pracexcp();
		}
	}
}
