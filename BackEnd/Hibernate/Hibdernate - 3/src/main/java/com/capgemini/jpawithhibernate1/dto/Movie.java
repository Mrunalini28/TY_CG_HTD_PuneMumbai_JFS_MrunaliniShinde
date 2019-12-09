package com.capgemini.jpawithhibernate1.dto;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie 
{   @Id
	@Column
	// @GeneratedValue(strategy = GenerationType.AUTO)  it will generate the primary key automatically
	private int id;
    @Column
	private String name;
    
   // @Column(name="name")
   //	private String mname;
    
    @Column
	private String rating;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	

}
