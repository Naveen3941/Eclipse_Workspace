package com.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.validation.model.Employee;

@Repository
public interface HomeRepository extends JpaRepository<Employee, Long> {
	@Transactional
	@Modifying
	@Query(value = "update registration u set u.active_registration_status = ? where u.first_name = ?", nativeQuery = true)
	public void updateEmployeeSetEmailForIdNative(String activeRegistrationStatus, String firstName);
}
