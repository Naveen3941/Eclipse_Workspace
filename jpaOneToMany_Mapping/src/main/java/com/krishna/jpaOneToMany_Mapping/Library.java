package com.krishna.jpaOneToMany_Mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Book_name;

	public Library() {
		super();
	}

	public Library(int id, String book_name) {
		super();
		this.id = id;
		Book_name = book_name;
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

	@Override
	public String toString() {
		return "Library [id=" + id + ", Book_name=" + Book_name + "]";
	}

}
