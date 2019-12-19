package com.krishna.jpaOneToMany_Mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "St")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String name;

	@ManyToMany
	private List<Library> lib;

	public Student() {
		super();
	}

	public Student(int sid, String name, List<Library> lib) {
		super();
		this.sid = sid;
		this.name = name;
		this.lib = lib;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Library> getLib() {
		return lib;
	}

	public void setLib(List<Library> lib) {
		this.lib = lib;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", lib=" + lib + "]";
	}

}
