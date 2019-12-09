package com.capgemini.set;

import java.util.Comparator;

public class Bymicr implements Comparator<Bank>
{

	@Override
	public int compare(Bank o1, Bank o2) {
		Long k=o1.micr;
		Long p=o2.micr;
		return k.compareTo(p);
	}
}
