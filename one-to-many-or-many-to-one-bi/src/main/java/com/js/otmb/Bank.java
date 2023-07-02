package com.js.otmb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String B_name;
	private long account_no;
	private String IFSC_code;

	@JoinColumn	//to remove the person_bank table
	
	@ManyToOne
	Person person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getB_name() {
		return B_name;
	}

	public void setB_name(String b_name) {
		B_name = b_name;
	}

	public long getAccount_no() {
		return account_no;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	public String getIFSC_code() {
		return IFSC_code;
	}

	public void setIFSC_code(String iFSC_code) {
		IFSC_code = iFSC_code;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
