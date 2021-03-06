package com.validation.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validation.model.Employee;
import com.validation.model.ErrorResponse;
import com.validation.service.HomeService;
import com.validation.validations.ValidationClass;

@RestController
public class HomeController {
	@Autowired
	HomeService service;
	Logger logger = Logger.getLogger(this.getClass());
	ErrorResponse errorResponse = new ErrorResponse();

	@PostMapping("/saveAll")
	public ResponseEntity<Object> saveAllData(@RequestBody Employee emp) {
		logger.info("request is comming to controller class");
		try {
			if (!ValidationClass.isValidateName(emp.getFirstName())) {
				errorResponse.setStatusMessage("FirstName Should Not Given Numbers and Special Characters ");
				errorResponse.setStatusCode("422");
				return new ResponseEntity<>(errorResponse, HttpStatus.UNPROCESSABLE_ENTITY);
			}
			if (!ValidationClass.isValidateName(emp.getLastName())) {
				errorResponse.setStatusMessage("LasttName Should Not Given Numbers and Special Characters ");
				errorResponse.setStatusCode("422");
				return new ResponseEntity<>(errorResponse, HttpStatus.UNPROCESSABLE_ENTITY);
			}
			if (ValidationClass.isValidateDate(emp.getDateOfBirth())) {
				errorResponse.setStatusMessage("Date of birth Should not given excess Year ");
				errorResponse.setStatusCode("422");
				return new ResponseEntity<>(errorResponse, HttpStatus.UNPROCESSABLE_ENTITY);
			}

			if (!ValidationClass.isValidateMobile2(emp.getMobileNum())) {
				errorResponse.setStatusMessage("Mobile Number Should not given Character and Special Characters ");
				errorResponse.setStatusCode("422");
				return new ResponseEntity<>(errorResponse, HttpStatus.UNPROCESSABLE_ENTITY);
			}
			if (!ValidationClass.isValidateMobile(emp.getMobileNum())) {
				errorResponse.setStatusMessage("Mobile Number Should not given 10 Digits ");
				errorResponse.setStatusCode("422");
				return new ResponseEntity<>(errorResponse, HttpStatus.UNPROCESSABLE_ENTITY);
			}
			if (!ValidationClass.isValidateGender(emp.getGender())) {
				errorResponse.setStatusMessage("Gender is mismatch ");
				errorResponse.setStatusCode("422");
				return new ResponseEntity<>(errorResponse, HttpStatus.UNPROCESSABLE_ENTITY);
			}
			if (!ValidationClass.isValidateEmail(emp.getEmail())) {
				errorResponse.setStatusMessage("Email is mismatch ");
				errorResponse.setStatusCode("422");
				return new ResponseEntity<>(errorResponse, HttpStatus.UNPROCESSABLE_ENTITY);
			}
			if (!ValidationClass.isValidateUserName(emp.getUsername())) {
				errorResponse.setStatusMessage("UserName is mismatch ");
				errorResponse.setStatusCode("422");
				return new ResponseEntity<>(errorResponse, HttpStatus.UNPROCESSABLE_ENTITY);
			}
			if (!ValidationClass.isValidatePassword(emp.getPassword())) {
				errorResponse.setStatusMessage(
						"Password Must Be 8 characters.Like one Uppercase, one special character and one number ");
				errorResponse.setStatusCode("422");
				return new ResponseEntity<>(errorResponse, HttpStatus.UNPROCESSABLE_ENTITY);
			}
			return service.saveAllData(emp);

		} catch (Exception e) {
			System.out.println("Exception Occured........");
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}

	}

	@RequestMapping("/activate/{name}")
	public ResponseEntity<Object> message(@PathVariable("name") String id) {
		System.out.println(id + "???????????");
		return service.message(id);
	}

}
