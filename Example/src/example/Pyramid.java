package example;

public class Pyramid {

	public static void main(String[] args) {
		int length=9;
		for(int i=1;i<=length;i++)
		{
			for(int j=i;j<length;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
