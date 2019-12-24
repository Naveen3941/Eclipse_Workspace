package example;

import java.util.Scanner;

public class StringRecursive {

	
		    public static Scanner scanner = new Scanner(System.in);

		 

		    public static void main(String[] args) throws StringIndexOutOfBoundsException {
              String s="a";
              System.out.println(s);
              String s1="b";
              System.out.println(s1+s);
		 

		        System.out.println("Enter a string ");
		        String str = scanner.nextLine();
		      
                
		 

		        System.out.println(recursiveMethod(str)+"??????????"+str);
		        
		        
		        
		        
		        
		    }

		 

	

		 

		    static String recursiveMethod(String str)
		    {
		    	//System.out.println(str+"**************");
		         if (( (str.length() <= 1)) )
		         {
		            // System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+str);
		                return str;
		         }
		        // System.out.println(str.substring(1) +"..."+str);
		 
		         return recursiveMethod(str.substring(1))+"@@@"+str.charAt(0) ;
		    }

		 

		}

//////////////////////////////////////////

