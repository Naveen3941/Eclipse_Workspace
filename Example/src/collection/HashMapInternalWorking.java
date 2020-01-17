package collection;

import java.util.HashMap;

public class HashMapInternalWorking {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();  
		map.put("Aman", 19);  
		map.put("Sunny", 29);  
		map.put("Ritesh", 39);  
		System.out.println(00101010 & 00001111 );
		
		 int y = 2657860;  //...0011 
		    int x = 15;  //...0111 
		  
		    // A typical use of '&&' 
		    if (y > 1 ) 
		    	System.out.println("y is greater than 1 AND y\n"); 
		  
		    // A typical use of '&' 
		    int z = x % y;   // 0011 
		     
		    System.out.println("z =" +z); 
		    int count=1;
		    for(int i=1;i<=100000;i++)
		    {
		    	if(i%15<=15)
		    	{
		    		count++;
		    		
		    	}
		    	else
		    	{
		    		System.out.println(i);
		    	}
		    }
		  System.out.println("k"+count);

	}

}
