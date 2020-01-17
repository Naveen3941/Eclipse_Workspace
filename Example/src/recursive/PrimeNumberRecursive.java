package recursive;

public class PrimeNumberRecursive {
      public static  int prime(int n)
      {
    	 int status=0;
    	  System.out.println("Prime Numbers Are:");
    	  for(int i=1;i<=n;i++)
    	  {
    		  status=0;
    		  for(int j=1;j<=i;j++)
    		  {
    			  if(i%j==0)
    				  
    			  {
    				  status++;
    				 
    			  }
    		  }
    		  if(status==2)
    		  {
    		  System.out.println(i);
    		  }
    	  }
    	  return 0;
      }
	public static void main(String[] args) {
		prime(100);

	}

}
