package com.capgemini.objectclass.methods;

public class cow {
	int id;
	String name;
	
     public boolean equals(Object ref) 
	{
		cow r=(cow)ref;
		
		if(this.id==r.id) 
		{
			if(this.name.equals(r.name)) 
			{
				return true;
			}
			else 
			{
			return false;
			}
		}
		return false;
	}
}



