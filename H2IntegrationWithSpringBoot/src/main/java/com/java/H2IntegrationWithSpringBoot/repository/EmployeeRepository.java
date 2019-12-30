package com.java.H2IntegrationWithSpringBoot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.java.H2IntegrationWithSpringBoot.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	/*@Query("SELECT e FROM Employee e WHERE e.name = :name")
	List<Employee> findByName(@Param("name") String name);*/

	/*@Query("SELECT a FROM Employee a WHERE a.name=:name and a.age=:age")
	List<Employee> findIdandName(@Param("name") String name, @Param("age") int age);*/
	
	List<Employee> findByName(String name);
	Employee findByIdAndName(int id,String name);
	List<Employee> findByIdOrName(int id,String name);
	List<Employee> findByNameContaining(String name);
	List<Employee> findByNameLike(String name);
	
}
