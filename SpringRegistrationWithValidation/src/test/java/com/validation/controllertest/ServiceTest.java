package com.validation.controllertest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.validation.model.Employee;
import com.validation.model.ErrorResponse;
import com.validation.repository.HomeRepository;
import com.validation.service.HomeService;

public class ServiceTest {
	@InjectMocks
	private HomeService homeService;
	@Mock
	private HomeRepository homeRepository;
	@Mock
	private JavaMailSender javaMailSender;
	@Mock
	private SimpleMailMessage simpleMailMessage;
	@Spy
	Employee employee = new Employee();
	@Spy
	ErrorResponse errorResponse = new ErrorResponse();
	@Spy
	ResponseEntity<Object> success = new ResponseEntity<>(HttpStatus.OK);
	@Spy
	ResponseEntity<Object> failure = new ResponseEntity<>(errorResponse, HttpStatus.UNPROCESSABLE_ENTITY);
	@Spy
	ResponseEntity<Object> conflict = new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);

	@Before
	public void init() throws Exception {
		MockitoAnnotations.initMocks(this);

	}

	public Employee empDetails() {
		employee.setId(1l);
		employee.setFirstName("aaa");
		employee.setLastName("qqq");
		employee.setUsername("llll");
		employee.setEmail("aqsw@gmail.com");
		employee.setGender("Male");
		employee.setDateOfBirth(Date.valueOf("2019-12-12"));
		employee.setActiveRegistrationStatus("true");
		employee.setMobileNum("9878456525");
		employee.setPassword("Naveen@123");
		return employee;
	}

	@Test
	public void saveTest() {
		Employee emp = empDetails();
		Employee save = homeRepository.save(emp);
		when(save).thenReturn(emp);
		ResponseEntity<Object> saveAllData = homeService.saveAllData(emp);
		System.out.println(saveAllData);
		HttpStatus statusCode = saveAllData.getStatusCode();
		assertEquals(HttpStatus.OK, statusCode);

	}
	
	@Test
	public void saveTest1() {
		Employee emp = empDetails();
		Employee save = homeRepository.save(emp);
		when(save).thenReturn(null);
		//emp=null;
		ResponseEntity<Object> saveAllData = homeService.saveAllData(emp);
		System.out.println(saveAllData);
		HttpStatus statusCode = saveAllData.getStatusCode();
		assertEquals(HttpStatus.UNPROCESSABLE_ENTITY, statusCode);

	}

}
