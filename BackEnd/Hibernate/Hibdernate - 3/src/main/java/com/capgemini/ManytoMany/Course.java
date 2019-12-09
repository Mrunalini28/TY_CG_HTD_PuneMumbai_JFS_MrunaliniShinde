package com.capgemini.ManytoMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Course 
{
	@Id
	@Column
	private int cid;
	@Column
	private String cname;
	@ManyToMany(mappedBy="course")
	private List<Student1> student;
	
	public List<Student1> getStudent() {
		return student;
	}
	public void setStudent(List<Student1> student) {
		this.student = student;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}


}
