package com.example.OneToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String c_name;
	private String c_teach;
	@OneToMany(targetEntity = Student.class)
	@JoinColumn(name = "addressId")
	private List<Student> naveen;

	public List<Student> getNaveen() {
		return naveen;
	}

	public void setNaveen(List<Student> naveen) {
		this.naveen = naveen;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_teach() {
		return c_teach;
	}

	public void setC_teach(String c_teach) {
		this.c_teach = c_teach;
	}

}
