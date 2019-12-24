package example;

public class NumberingOrdering {

	public static void main(String[] args) {
		String res="";
		int res1=0;
		for(int i=1;i<=5;i++)
		{System.out.print(res); 
			for(int j=1;j<=i;j++)
			{
				
				res=res+j;
				System.out.print(j);
			}
			
			System.out.println();
		}
	
		for(int i=0;i<res.length();i++)
		{
			int res2=Integer.parseInt(res.substring(i,i+1));
			
			res1=res1+res2;
		}
		System.out.println(res1);

	}

}
