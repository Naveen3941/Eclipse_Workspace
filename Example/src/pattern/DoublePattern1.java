package pattern;

public class DoublePattern1 {

	public static void main(String[] args) {
		int length=9;
		int count=0;
		System.out.print("*");
		for(int i=1;i<=length;i++)
		{
			for(int j=i;j<(length*2)-count;j++)
			{
				System.out.print("*");
			}
			for(int k=(length+1)-i;k<=length;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			count=count+2;
		}

	}

}
