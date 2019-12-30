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

import com.validation.controller.HomeController;
import com.validation.model.Employee;
import com.validation.model.ErrorResponse;
import com.validation.service.HomeService;

public class ControllerTest {
	@InjectMocks
	private HomeController homeController;
	@Mock
	private HomeService service;
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
	public void init() {
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
		when(service.saveAllData(emp)).thenReturn(success);
		ResponseEntity<Object> saveAllData = homeController.saveAllData(emp);
		HttpStatus statusCode = saveAllData.getStatusCode();
		assertEquals(HttpStatus.OK, statusCode);
	}
	
	@Test
	public void firstNameTest() {
		Employee emp = empDetails();
		emp.setFirstName("123456789");
		when(service.saveAllData(emp)).thenReturn(failure);
		ResponseEntity<Object> saveAllData = homeController.saveAllData(emp);
		HttpStatus statusCode = saveAllData.getStatusCode();
		assertEquals(HttpStatus.UNPROCESSABLE_ENTITY, statusCode);
	}
	@Test
	public void lastNameTest() {
		Employee emp = empDetails();
		emp.setLastName("1234");
		when(service.saveAllData(emp)).thenReturn(failure);
		ResponseEntity<Object> saveAllData = homeController.saveAllData(emp);
		HttpStatus statusCode = saveAllData.getStatusCode();
		assertEquals(HttpStatus.UNPROCESSABLE_ENTITY, statusCode);
	}
	@Test
	public void dateOfBirthTest() {
		Employee emp = empDetails();
		emp.setDateOfBirth(Date.valueOf("2020-12-12"));
		when(service.saveAllData(emp)).thenReturn(failure);
		ResponseEntity<Object> saveAllData = homeController.saveAllData(emp);
		HttpStatus statusCode = saveAllData.getStatusCode();
		assertEquals(HttpStatus.UNPROCESSABLE_ENTITY, statusCode);
	}
	
	@Test
	public void mobileNumberTest() {
		Employee emp = empDetails();
		emp.setMobileNum("ABCD");
		when(service.saveAllData(emp)).thenReturn(failure);
		ResponseEntity<Object> saveAllData = homeController.saveAllData(emp);
		HttpStatus statusCode = saveAllData.getStatusCode();
		assertEquals(HttpStatus.UNPROCESSABLE_ENTITY, statusCode);
	}
	@Test
	public void mobileNumber2Test() {
		Employee emp = empDetails();
		emp.setMobileNum("9876543");
		when(service.saveAllData(emp)).thenReturn(failure);
		ResponseEntity<Object> saveAllData = homeController.saveAllData(emp);
		HttpStatus statusCode = saveAllData.getStatusCode();
		assertEquals(HttpStatus.UNPROCESSABLE_ENTITY, statusCode);
	}
	@Test
	public void genderTest() {
		Employee emp = empDetails();
		emp.setGender("jkl");
		when(service.saveAllData(emp)).thenReturn(failure);
		ResponseEntity<Object> saveAllData = homeController.saveAllData(emp);
		HttpStatus statusCode = saveAllData.getStatusCode();
		assertEquals(HttpStatus.UNPROCESSABLE_ENTITY, statusCode);
	}
	@Test
	public void emailTest() {
		Employee emp = empDetails();
		emp.setEmail("assss");
		when(service.saveAllData(emp)).thenReturn(failure);
		ResponseEntity<Object> saveAllData = homeController.saveAllData(emp);
		HttpStatus statusCode = saveAllData.getStatusCode();
		assertEquals(HttpStatus.UNPROCESSABLE_ENTITY, statusCode);
	}
	@Test
	public void userNameTest() {
		Employee emp = empDetails();
		emp.setUsername("@wwww");
		when(service.saveAllData(emp)).thenReturn(failure);
		ResponseEntity<Object> saveAllData = homeController.saveAllData(emp);
		HttpStatus statusCode = saveAllData.getStatusCode();
		assertEquals(HttpStatus.UNPROCESSABLE_ENTITY, statusCode);
	}
	
	@Test
	public void passwordTest() {
		Employee emp = empDetails();
		emp.setPassword("9876543");
		when(service.saveAllData(emp)).thenReturn(failure);
		ResponseEntity<Object> saveAllData = homeController.saveAllData(emp);
		HttpStatus statusCode = saveAllData.getStatusCode();
		assertEquals(HttpStatus.UNPROCESSABLE_ENTITY, statusCode);
	}
	
	@Test
	public void exceptionTest() {
		employee = null;
		when(service.saveAllData(employee)).thenReturn(conflict);
		ResponseEntity<Object> saveAllData = homeController.saveAllData(employee);
		HttpStatus statusCode = saveAllData.getStatusCode();
		assertEquals(HttpStatus.CONFLICT, statusCode);
	}

}
