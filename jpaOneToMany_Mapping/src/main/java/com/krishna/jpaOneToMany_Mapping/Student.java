package com.krishna.jpaOneToMany_Mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Stu")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String name;
	
	@OneToMany(targetEntity = Library.class)
	private List<Library> books;

	public Student() {
		super();
	}

	public Student(int sid, String name, List<Library> books) {
		super();
		this.sid = sid;
		this.name = name;
		this.books = books;
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

	public List<Library> getBooks() {
		return books;
	}

	public void setBooks(List<Library> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", books=" + books + "]";
	}
	
	
}
