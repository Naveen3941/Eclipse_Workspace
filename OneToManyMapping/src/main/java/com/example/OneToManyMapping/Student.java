package com.example.OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_onetoMany")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int s_id;
	private String s_name;
	private String phonenumber;

	// @ManyToOne(targetEntity=Course.class)
	// private Course lib;
	//
	//
	//
	//
	//
	// public Course getLib() {
	// return lib;
	// }
	// public void setLib(Course lib) {
	// this.lib = lib;
	// }
	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

}
