package com.capgemini.sorting;

public class Student implements Comparable<Student>
{
	int id;
	String name;
	double percentage;
	public Student(int id, String name, double percentage) 
	{
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	//Logic to sort Student by ID
	/*
	 * @Override public int compareTo(Student s)
	 *  {
	 *   if(this.id > s.id) 
	 *   { 
	 *   return 1; 
	 *   }
	 * else if(this.id < s.id)
	 *  {
	 * return -1; } 
	 * else 
	 * { 
	 * return 0;
	 * 
	 * } }
	 */

	//Logic to sort by percentage

	/*
	 * @Override public int compareTo(Student s) { if(this.percentage >
	 * s.percentage) { return 1; } else if(this.percentage < s.percentage) { return
	 * -1; } else { return 0;
	 * 
	 * } }
	 */
	//Logic to sort by name

	/*
	 * @Override public int compareTo(Student s) 
	 * { String k= this.name; 
	 * String t=s.name; 
	 * int res=k.compareTo(t); 
	 * return res; 
	 * }
	 */
	/*
	 * @Override public int compareTo(Student s) { return
	 * this.name.compareTo(s.name); }
	 */

	//Logic to sort in decending order

	@Override public int compareTo(Student s) 
	{ 
		return this.name.compareTo(s.name) * -1;  
	}

}