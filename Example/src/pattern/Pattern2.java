package pattern;

public class Pattern2 {

	public static void main(String[] args) {
		int count=4;
		int res=4;
		for(int i=1;i<=5;i++)
		{System.out.print(i+" ");
			for(int j=1; j<i;j++)
			{
				
				
				System.out.print((i+res)+" ");
				count--;
				res=res+count;
				
			}
			System.out.println();
			count=4;
			res=4;
		}

	}

}
