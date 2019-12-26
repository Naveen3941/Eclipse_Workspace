package pattern;

public class Pattern8 {

	public static void main(String[] args) {
     int length=7;
		for (int i = 1; i <= 7; i++) {
			for (int j = length; j >= i; j--)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
			}

	}

}
