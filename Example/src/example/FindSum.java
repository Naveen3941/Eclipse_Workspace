package example;

import java.util.Date;

public class FindSum {

	public static void main(String[] args) {
		Date d1=new Date();
     int arr[]= {1,10,100,11};
     int ignore1=1;
     int ignore2=11;
     String a="Hello India";
     int b=a.length();
     System.out.println(a.substring(6,b)+"################");
 
    // System.out.println(a.equalsIgnoreCase(b));
     int res=0,res1=0,start=0,last=0;
     boolean flag1=false,flag2=false;
     for(int i=0;i<arr.length;i++)
     {
    	 if(arr[i]==ignore1)
    	 {
    		 start=i;
    		 flag1=true;
    	 }
    	 if(arr[i]==ignore2)
    	 {
    		 last=i;
    		 flag2=true;
    	 }
    	 res=res+arr[i];
     }
     if(flag1==true && flag2==true)
     {
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 if(!(i<=start && i<=last))
    		 {
    			 
    		 }
    	 }
     }

	}

}
