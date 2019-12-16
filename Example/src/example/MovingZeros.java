package example;

public class MovingZeros {

	public static void main(String[] args) {
	
		int a[]= {2,6,3,0,6,0,7,0,7,0};
		int a1[]=new int[a.length];
		int count=0;
		for(int b:a)
		{
			if(b==0)
			{
			count++;
			//System.out.print(count+"...."+b);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
			a1[count]=a[i];
			count++;
			}
			//System.out.println(a1[i]);
		}
		for(int t:a1)
		{
			System.out.print(t+" ");
		}

	}

}
