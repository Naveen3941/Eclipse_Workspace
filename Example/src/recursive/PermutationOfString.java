package recursive;

public class PermutationOfString {

	
    private static void StringPermutation(String permutation, String input)
    {   
    	int count=0;
        if(input.length() == 0)
        {
        	System.out.println(permutation);
        }
        else
        {
            for (int i = 0; i <input.length(); i++)
          {  
        	count++;
            	System.out.println(i+"..."+permutation+input.charAt(i)+">>>"+ input.substring(0, i)+input.substring(i+1, input.length())+"..."+count);
                StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
          }
        }
    }
     
	public static void main(String[] args) {
	
		 StringPermutation("", "abc");
		 
		
	}

}
