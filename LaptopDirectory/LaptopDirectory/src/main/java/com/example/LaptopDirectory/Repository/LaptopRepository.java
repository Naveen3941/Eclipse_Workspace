package com.example.LaptopDirectory.Repository;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.LaptopDirectory.Model.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

	@Query(value = "SELECT email FROM Laptop")
	public List<String> findByAllEmail();
	//@Query("SELECT u FROM User u WHERE u.status = ?1")
	@Query(value="SELECT u from Laptop u where u.name=?1")
	public Optional<String> findByName(String name);

	@Transactional
	@Modifying
	@Query(value = "update Laptop u set u.email = ? where u.id = ?", nativeQuery = true)
	public void updateUserSetEmailForIdNative(String email, int id);

}