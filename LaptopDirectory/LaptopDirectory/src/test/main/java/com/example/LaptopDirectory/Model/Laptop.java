package com.example.LaptopDirectory.Model;

import java.util.Comparator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.omg.CORBA.PUBLIC_MEMBER;

@Entity
@Table(name = "laptop")
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String name;
	private String email;
	

	private int price;

	private LaptopAddress l1;

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(int id, String name, int price, String email, LaptopAddress l1) {

		this.id = id;
		this.name = name;
		this.price = price;
		this.email=email;
		this.l1 = l1;
	}
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LaptopAddress getL1() {
		return l1;
	}

	public void setL1(LaptopAddress l1) {
		this.l1 = l1;
	}

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((l1 == null) ? 0 : l1.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (l1 == null) {
			if (other.l1 != null)
				return false;
		} else if (!l1.equals(other.l1))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	

}
