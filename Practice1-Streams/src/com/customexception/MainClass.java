package com.customexception;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws InvaliAgeException {

      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the Age:");
      int age=scanner.nextInt();
      if(age>=18)
      {
    	  System.out.println("You are eligible to vote");
      }
      else
      {
    	  try
    	  {
    	  throw new InvaliAgeException("You are not eligible to vote");
    	  }
    	  catch(InvaliAgeException e)
    	  {
    		  System.out.println(e.getMessage());
    	  }
      }

	}

}
