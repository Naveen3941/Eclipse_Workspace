package com.validation.validations;

import java.sql.Date;
import java.util.regex.Pattern;

public class ValidationClass {
	
	protected Class<ValidationClass> validation;
	
	public static boolean isValidateName(String name) {
		return Pattern.matches("[a-zA-Z]*", name);
	}

	public static boolean isValidateDate(Date name) {
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		if (date.compareTo(name) < 0) {

			return true;
		}

		return false;

	}

	public static boolean isValidateMobile(String number) {

		return Pattern.matches("[0-9]{10}", number);

	}

	public static boolean isValidateMobile2(String number) {
		System.out.println("qqqqqqq");

		return Pattern.matches("\\d*", number);

	}

	public static boolean isValidateGender(String name) {

		if (name.equalsIgnoreCase("Male") || name.equalsIgnoreCase("Female")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isValidateEmail(String number) {

		return Pattern.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
				number);

	}

	public static boolean isValidateUserName(String name) {
		return Pattern.matches("[a-zA-Z]*+[0-9]*", name);
	}

	public static boolean isValidatePassword(String number) {
		return Pattern.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", number);

	}

}
