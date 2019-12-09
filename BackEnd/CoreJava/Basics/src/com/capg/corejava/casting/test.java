package com.capg.corejava.casting;

public class test {

	public static void main(String[] args) {
	pen p=new marker();
	marker i=(marker)p;
	
	i.cost=100;
	i.write();
	i.size=55.5;
	i.color(); 
	}

}
