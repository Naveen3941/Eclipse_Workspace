package recursive;

public class LessThan {
     public static int getLLessThanN(int number, int digit)
     {
    	 String s1,s2=String.valueOf(digit);
    	 int i=1;
    	 for( i=number;i>=1;i--)
    	 {
    		 s1=String.valueOf(i);
    		 if(!s1.contains(s2))
    		 {
    			
    			 break;
    			 
    		 }
    	 }
    	 return i;
     }
	
	public static void main(String[] args) {
		System.out.println(getLLessThanN(123, 2));
		 
       System.out.println(getLLessThanN(4582, 5));
 
       System.out.println(getLLessThanN(98512, 5));
 
        System.out.println(getLLessThanN(548624, 8));

	}

}
