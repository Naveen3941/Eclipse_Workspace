package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StreamExample1 {

	public static void main(String[] args) {
		List<EmployeeModel> listOfEmployee=new ArrayList<EmployeeModel>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int numberOfEmployees=scanner.nextInt();
		for(int i=1;i<=numberOfEmployees;i++)
		{
		System.out.println("Enter the id:");
		int id=scanner.nextInt();
		System.out.println("Enter the name");
		String name=scanner.next();
		System.out.println("Enter the pincode");
        int pin=scanner.nextInt();
        listOfEmployee.add(new EmployeeModel(id, name, pin));
		}
		System.out.println("***************************************************************************************");
		System.out.println();
		listOfEmployee.forEach(System.out::println);
		//listOfEmployee.stream().sorted(Comparator.comparingInt(EmployeeModel::getPincode).reversed()).limit(3).map(EmployeeModel::getName).forEach(System.out::println);
		
	}

}
