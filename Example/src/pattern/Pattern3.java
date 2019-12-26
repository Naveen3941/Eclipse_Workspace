package pattern;

public class Pattern3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(i==j)
				{
					System.out.print(i-1);
				}
				else
				{
				System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}
