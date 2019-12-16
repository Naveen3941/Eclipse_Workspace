package example;

public class ExchangePlacesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,6,8,10};
		
		int mod=a.length%2;
		int count=a.length-1;
		System.out.println(mod+"..."+a.length);
		if(mod==1)
		{
			for(int i=0;i<a.length/2;i++)
			{
				int temp=a[i];
				a[i]=a[count];
				a[count]=temp;
				count--;
				
			}
			
		}
		else
		{
			for(int i=0;i<=a.length/2;i++)
			{
				int temp=a[i];
				a[i]=a[count];
				a[count]=temp;
				count--;
				
			}
		}
		for(int res:a)
		{
			System.out.print(res+" ");
		}

	}

}
