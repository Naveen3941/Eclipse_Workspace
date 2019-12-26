package pattern;

public class Pattern7 {

	public static void main(String[] args) {
           int length=7;
		for (int i = 1; i <= 7; i++) 
		{
			
			for (int j = length; j > length-i; j--) 
			{
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
