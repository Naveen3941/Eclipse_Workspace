package pattern;

public class DoublePattern {

	public static void main(String[] args) {
		int length=10;int count=0;
		for(int i=1;i<length;i++)
		{
			for(int k=1;k<=i+count;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=length-i;j++)
			{
				System.out.print(j+" ");
			}
			for(int m=length-(i+1);m>=1;m--)
			{
				System.out.print(m+" ");
			}
			System.out.println();
			count++;
		}

	}

}
