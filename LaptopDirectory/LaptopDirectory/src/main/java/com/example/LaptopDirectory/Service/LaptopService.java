package com.example.LaptopDirectory.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.LaptopDirectory.Model.Laptop;
import com.example.LaptopDirectory.Model.LaptopAddress;
import com.example.LaptopDirectory.Repository.LaptopRepository;

@Service
public class LaptopService {
	@Autowired
	LaptopRepository repository;

	public void saveAll(Laptop l1) {

		repository.save(l1);

	}

	public Optional<Laptop> getOne(int id) {

		return repository.findById(id);
	}

	public List<Laptop> getAll() {
		List<Laptop> l2 = repository.findAll();

		Collections.sort(l2, new Comparator<Laptop>()

		{
			@Override
			public int compare(Laptop o1, Laptop o2) {

				return o1.getName().compareTo(o2.getName());
			}
		});

		return l2;
	}

	public boolean checkObject() {
		boolean b2 = false;

		Laptop l4 = new Laptop();
		LaptopAddress l5 = new LaptopAddress();

		l5.setAddress("kmm");
		l5.setPincode(51234);
		l5.setStreet("rai");
		l4.setId(3);
		l4.setName("apple");
		l4.setPrice(600);
		l4.setL1(l5);

		System.out.println(l4);

		List<Laptop> l2 = repository.findAll();
		System.out.println(l2.get(2) + "...." + l2.contains(l4));
		if (l2.contains(l4)) {
			b2 = true;
			System.out.println("object is existed in database:.......");
			return b2;
		}

		return b2;
	}

	public List<String> getEmail() {
		List<String> l1 = repository.findByAllEmail();
		for (String a : l1) {
			System.out.println(a + "...inserted");
		}
		return l1;
	}
    
	public void updateColumn(int id, String name) {

		System.out.println(id + "........" + name);

		repository.updateUserSetEmailForIdNative(name, id);

	}

	public void deleteAll() {
		repository.deleteAll();

	}

	public void deleteById(int id) {
		repository.deleteById(id);

	}

	public String getName(String name) {
		
		Optional<String> res=repository.findByName(name);
		
		if(res.isPresent())
		{
			System.out.println("value is in database....");
			return "value is in database....";
		}
		else
		{
		System.out.println("value is not in database");
		return "value is not in database....";
		}
		
	}

}
