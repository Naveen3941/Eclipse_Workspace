package com.validation.validations;

import java.sql.Date;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.regex.Pattern;

import javax.persistence.criteria.CriteriaBuilder.In;

public class ValidationClass {
	
	protected Class<ValidationClass> validation;
	
	public static boolean isValidateName(String name) {
		return Pattern.matches("[a-zA-Z]*", name);
	}

	public static boolean isValidateDate(Date name) {
		
		
		 long millis=System.currentTimeMillis();  
	        java.sql.Date date=new java.sql.Date(millis);  
	        System.out.println(name+"..."+date);
	        String check1=name.toString();
	        String check2=date.toString();
	        System.out.println(check1.substring(0,4)+"..."+check2.substring(0,4));
	        int res1=Integer.parseInt(check1.substring(0,4));
	        int res2=Integer.parseInt(check2.substring(0,4));
	        int c=res2-res1;
	        System.out.println(c);
	        if(c>18 && c<80)
	        {
	        	return false;
	        }

		return true;

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

		//return Pattern.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9_-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
			//	number);
		
		//System.out.println(Pattern.matches("([a-zA-Z0-9]*)([@]?)([a-zA-Z]*)", "a11sddddsffff@a"));//true
		return Pattern.matches("^[_A-Za-z0-9-]*@[A-Za-z0-9_-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
				number);

	}

	public static boolean isValidateUserName(String name) {
		return Pattern.matches("[a-zA-Z]*+[0-9]*", name);
	}

	public static boolean isValidatePassword(String number) {
		return Pattern.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", number);

	}

}
