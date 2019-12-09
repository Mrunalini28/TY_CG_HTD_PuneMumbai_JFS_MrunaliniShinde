package com.cagemini.array;

public class int_array {
	public static void main(String[] args) {
		int[] a=new int[4];
		a[0]=5;
		a[1]=3;
		a[2]=8;
		a[3]=6;
        int b=a.length;
        System.out.println("array length is:"+b);
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
	}
}
