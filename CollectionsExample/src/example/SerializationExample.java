package example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Test implements Serializable {

	
	    int i; 
	     String s;
	  
	    // A class constructor 
	    public Test(int i,String s) 
	    { 
	        this.i = i; 
	        this.s = s; 
	    } 
	} 
	  
	 public class SerializationExample 
	{ 
	    public static void main(String[] args) 
	      throws IOException, ClassNotFoundException 
	    { 
	    	Test a = new Test(20,"GeeksForGeeks"); 
	  
	        // Serializing 'a' 
	        FileOutputStream fos = new FileOutputStream("xyz.txt"); 
	        ObjectOutputStream oos = new ObjectOutputStream(fos); 
	        oos.writeObject(a); 
	          System.out.println(a.i+" "+a.s);
	        // De-serializing 'a' 
	        FileInputStream fis = new FileInputStream("xyz.txt"); 
	        ObjectInputStream ois = new ObjectInputStream(fis); 
	        Test b = (Test)ois.readObject();//down-casting object 
	  
	        System.out.println(b.i+" "+b.s); 
	  
	        // closing streams 
	        oos.close(); 
	        ois.close(); 
	    } 
	} 