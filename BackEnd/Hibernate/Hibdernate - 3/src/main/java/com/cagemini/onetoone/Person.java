package com.cagemini.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person 
{   @Id
	@Column
	private int pid;
	@Column
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="vid")
	private VoterCard Votercard;
	
	
	public VoterCard getVoterCard() {
		return Votercard;
	}
	public void setVoterCard(VoterCard voterCard) {
		Votercard = voterCard;
	}
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
