package example;

public class PrimeNumbers {
	public static void main(String[] args) {
		int prevPrevVal = 0;
		int prevVal = 1;
		int currVal;
		System.out.print(prevPrevVal+" ");
		System.out.print(prevVal+" ");
		 currVal = prevVal + prevPrevVal;
		 prevPrevVal = prevVal;
		    prevVal = currVal; 
		
		do
		{       
		    
		    System.out.print(currVal+" ");
		    currVal = prevVal + prevPrevVal;

		    prevPrevVal = prevVal;
		    prevVal = currVal;          
		} while (prevVal <= 89);
	}
}
