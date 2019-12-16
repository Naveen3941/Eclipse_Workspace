package example;

public class Bubble {

	public static void main(String[] args) {
     int temp=0;
     int array[]= {11,15,12,10};     
     for (int j = 1; j < array.length; j++) {  
         int key = array[j];  
         int i = j-1;  
         while ( (i > -1) && ( array [i] > key ) ) {  
             array [i+1] = array [i];  
             i--;  
         }  
         array[i+1] = key;  
     }  
   
     for(int a:array)
     {
    	 System.out.println(a);
     }

	}

}
