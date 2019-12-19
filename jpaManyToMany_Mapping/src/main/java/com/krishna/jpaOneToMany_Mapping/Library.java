package com.krishna.jpaOneToMany_Mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "li")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Book_name;

	@ManyToMany(targetEntity = Student.class)
	private List<Student> st;

	public Library() {
		super();
	}

	public Library(int id, String book_name, List<Student> st) {
		super();
		this.id = id;
		Book_name = book_name;
		this.st = st;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBook_name() {
		return Book_name;
	}

	public void setBook_name(String book_name) {
		Book_name = book_name;
	}

	public List<Student> getSt() {
		return st;
	}

	public void setSt(List<Student> st) {
		this.st = st;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", Book_name=" + Book_name + ", st=" + st + "]";
	}

}
